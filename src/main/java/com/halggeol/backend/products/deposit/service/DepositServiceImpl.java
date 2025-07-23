package com.halggeol.backend.products.deposit.service;

import com.halggeol.backend.domain.Deposit;
import com.halggeol.backend.products.deposit.mapper.DepositMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepositServiceImpl implements DepositService {

    private final DepositMapper depositMapper;

    @Override
    public List<Deposit> getAll() {
        return depositMapper.getAll();
    }
}
