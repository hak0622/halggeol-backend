package com.halggeol.backend.products.savings.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class FssSavingsResponseDTO { // API 응답 전체를 감싸는 최상위 객체
    private FssSavingsResultDTO result;
}