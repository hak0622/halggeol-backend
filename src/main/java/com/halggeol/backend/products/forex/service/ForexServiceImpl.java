package com.halggeol.backend.products.forex.service;

import com.halggeol.backend.domain.Forex;
import com.halggeol.backend.products.forex.mapper.ForexMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ForexServiceImpl implements ForexService {

    private final ForexMapper forexMapper;

    @Override
    public List<Forex> getAll() {
        return forexMapper.getAll();
    }
}
