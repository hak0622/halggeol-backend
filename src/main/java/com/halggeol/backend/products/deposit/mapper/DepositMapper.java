package com.halggeol.backend.products.deposit.mapper;

import com.halggeol.backend.domain.Deposit;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepositMapper {
    List<Deposit> getAll();
}
