package com.halggeol.backend.products.unified.service;

import com.halggeol.backend.products.unified.dto.UnifiedProductDTO;
import java.util.List;

public interface UnifiedProductService {
    List<UnifiedProductDTO> getAllProducts();
}
