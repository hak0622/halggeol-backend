package com.halggeol.backend.products.savings.mapper;

import com.halggeol.backend.domain.Savings;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SavingsMapper {
    List<Savings> getAll();

}
