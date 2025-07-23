package com.halggeol.backend.products.fund.controller;

import com.halggeol.backend.domain.Fund;
import com.halggeol.backend.products.fund.service.FundService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fund")
@RequiredArgsConstructor
public class FundController {

    private final FundService fundService;

    @GetMapping
    public List<Fund> getAllFund(){
        return fundService.getAll();
    }
}
