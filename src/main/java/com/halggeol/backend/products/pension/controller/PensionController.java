package com.halggeol.backend.products.pension.controller;

import com.halggeol.backend.domain.Pension;
import com.halggeol.backend.products.pension.service.PensionService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pension")
@RequiredArgsConstructor
public class PensionController {

    private final PensionService pensionService;

    @GetMapping
    public List<Pension> getAllPension() {
        return pensionService.getAll();
    }
}
