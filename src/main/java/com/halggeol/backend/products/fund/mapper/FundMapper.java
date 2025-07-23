package com.halggeol.backend.products.fund.mapper;

import com.halggeol.backend.domain.Fund;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FundMapper {
    List<Fund> getAll();
}
