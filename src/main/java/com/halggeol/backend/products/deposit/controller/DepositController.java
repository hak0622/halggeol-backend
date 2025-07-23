package com.halggeol.backend.products.deposit.controller;

import com.halggeol.backend.domain.Deposit;
import com.halggeol.backend.products.deposit.service.DepositService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/deposit")
@RequiredArgsConstructor
public class DepositController {

    private final DepositService depositService;

    @GetMapping
    public List<Deposit> getAllDeposit() {
        return depositService.getAll();
    }
}
