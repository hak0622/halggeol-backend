package com.halggeol.backend.products.pension.mapper;

import com.halggeol.backend.domain.Pension;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PensionMapper {
    List<Pension> getAll();
}
