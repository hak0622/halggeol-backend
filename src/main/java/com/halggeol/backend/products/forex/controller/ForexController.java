package com.halggeol.backend.products.forex.controller;

import com.halggeol.backend.domain.Forex;
import com.halggeol.backend.products.forex.service.ForexService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/forex")
@RequiredArgsConstructor
public class ForexController {

    private final ForexService forexService;

    @GetMapping
    public List<Forex> getAllForex() {
        return forexService.getAll();
    }
}
