package com.halggeol.backend.products.deposit.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.util.List;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FssDepositResultDTO {
    private String prdtDiv; // 상품 구분
    private int totalCount; // 총 상품건수
    private int maxPageNo; // 총 페이지 건수
    private int nowPageNo; // 현재 조회 페이지 번호
    private String errCd; // 응답코드
    private String errMsg; // 응답메시지

    @JsonProperty("baseList")
    private List<FssDepositProductDTO> baseList; // 예금 상품 기본 정보 리스트
    @JsonProperty("optionList")
    private List<FssDepositOptionDTO> optionList; // 금리 등 옵션 정보 리스트
}
