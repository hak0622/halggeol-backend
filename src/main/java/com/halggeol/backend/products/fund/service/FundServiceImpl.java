package com.halggeol.backend.products.fund.service;

import com.halggeol.backend.domain.Fund;
import com.halggeol.backend.products.fund.mapper.FundMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FundServiceImpl implements FundService {

    private final FundMapper fundMapper;

    @Override
    public List<Fund> getAll() {
        return fundMapper.getAll();
    }
}
