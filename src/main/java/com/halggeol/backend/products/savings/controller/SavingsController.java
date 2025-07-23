package com.halggeol.backend.products.savings.controller;

import com.halggeol.backend.products.savings.client.SavingsApiClient;
import com.halggeol.backend.products.savings.dto.FssSavingsProductDTO;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class SavingsController {

    private final SavingsApiClient savingsApiClient;

    @GetMapping("/savings")
    public Map<String, Object> getSavingsProducts() {
        List<FssSavingsProductDTO> list = savingsApiClient.fetchSavingsProducts();

        Map<String, Object> response = new HashMap<>();
        response.put("count", list.size());
        response.put("savings products", list);

        return response;
    }

}
