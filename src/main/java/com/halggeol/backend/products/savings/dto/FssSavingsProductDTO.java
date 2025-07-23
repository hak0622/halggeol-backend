package com.halggeol.backend.products.savings.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FssSavingsProductDTO { //baseList 부분
    private String dclsMonth; // 공시 제출월[YYYYMM]
    private String finCoNo; // 금융회사 코드
    private String finPrdtCd; // 금융상품 코드
    private String korCoNm; //금융회사 명
    private String finPrdtNm; // 금융 상품명
    private String joinWay; // 가입 방법
    private String mtrtInt; //만기 후 이자율
    private String spclCnd; // 우대 조건
    private String joinDeny; // 가입제한 (Ex. 1:제한없음, 2:서민전용, 3:일부제한)
    private String joinMember; // 가입 대상
    private String etcNote; // 기타 유의사항
    private String maxLimit; // 최고 한도
    private String dclsStrtDay; // 공시 시작일
    private String dclsEndDay; // 공시 종료일
    private String finCoSubmDay; // 금융회사 제출일

}
