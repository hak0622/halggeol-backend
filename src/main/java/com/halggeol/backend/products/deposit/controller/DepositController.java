package com.halggeol.backend.products.deposit.controller;

import com.halggeol.backend.products.deposit.client.DepositApiClient;
import com.halggeol.backend.products.deposit.dto.FssDepositProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class DepositController {

    private final DepositApiClient depositApiClient;

    @GetMapping("/deposit")
    public Map<String, Object> getDepositProducts() {
        List<FssDepositProductDTO> list = depositApiClient.fetchDepositProducts();

        Map<String, Object> response = new HashMap<>();
        response.put("count", list.size());
        response.put("deposit products", list);

        return response;
    }
}
