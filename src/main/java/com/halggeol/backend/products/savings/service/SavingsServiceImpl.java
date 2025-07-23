package com.halggeol.backend.products.savings.service;

import com.halggeol.backend.domain.Savings;
import com.halggeol.backend.products.savings.mapper.SavingsMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SavingsServiceImpl implements SavingsService {

    private final SavingsMapper savingsMapper;

    @Override
    public List<Savings> getAll() {
        return savingsMapper.getAll();
    }
}
