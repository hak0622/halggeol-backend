package com.halggeol.backend.products.deposit.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.halggeol.backend.products.deposit.dto.FssDepositProductDTO;
import com.halggeol.backend.products.deposit.dto.FssDepositResponseDTO;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
@RequiredArgsConstructor
public class DepositApiClient { // 금융감독원 예금 API 호출 전용 클라이언트 클래스
    private final RestTemplate restTemplate; // 외부(금융감독원) API에 HTTP 요청을 보냄
    private final String BASE_URL = "http://finlife.fss.or.kr/finlifeapi/depositProductsSearch.json";
    private final String AUTH_KEY = "d6bacda5805286b5ae1da6177f3fe454";

    // 응답을 Java 객체(DepositResponse)로 자동 변환
    public List<FssDepositProductDTO> fetchDepositProducts(){ // 정기예금 API
        String url = BASE_URL+"?auth="+AUTH_KEY+"&topFinGrpNo=020000&pageNo=1";
        log.info("금융감독원 예금 API 호출 URL: {}", url);

        // 1. 헤더 설정
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        headers.set("User-Agent", "Mozilla/5.0");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        // 2. 호출
        ResponseEntity<String> responseEntity =
            restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        log.info("응답 HTTP 상태: {}", responseEntity.getStatusCode());
        log.info("응답 헤더: {}", responseEntity.getHeaders());

        // 3. 본문 확인
        String body = responseEntity.getBody();
        log.info("API 응답 바디: {}", body);

//        DepositResponse response = restTemplate.getForObject(url, DepositResponse.class);

        // 4. 수동 JSON 매핑
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            FssDepositResponseDTO response = mapper.readValue(body, FssDepositResponseDTO.class);

            if (response.getResult() == null) {
                throw new IllegalStateException("응답 내 result가 null입니다.");
            }

            return response.getResult().getBaseList();

        } catch (Exception e) {
            log.error("JSON 매핑 실패", e);
            throw new RuntimeException("응답 매핑 중 오류 발생", e);
        }
    }

}
