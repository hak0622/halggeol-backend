package com.halggeol.backend.products.deposit.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FssDepositOptionDTO { // optionList 부분
    private String dclsMonth; // 공시 제출월[YYYYMM]
    private String finCoNo; // 금융회사 코드
    private String finPrdtCd; // 금융상품 코드
    private String intrRateType; // 저축 금리 유형
    private String intrRateTypeNm; // 저축 금리 유형명
    private String saveTrm; // 저축 기간
    private double intrRate; // 저축 금리
    private double intrRate2; // 최고 우대금리
}
