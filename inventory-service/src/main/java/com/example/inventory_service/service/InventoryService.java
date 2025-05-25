package com.example.inventory_service.service;

import com.example.inventory_service.dto.InventoryResponse;
import com.example.inventory_service.repository.InventoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository){
        this.inventoryRepository = inventoryRepository;
    }

    @Transactional(readOnly = true)
    public List<InventoryResponse> isInStock(List<String> skuCode){
        return inventoryRepository.findBySkuCodeIn(skuCode).stream()
                .map(inventory -> {
                    InventoryResponse inventoryResponse = new InventoryResponse();
                    inventoryResponse.setSkuCode(inventory.getSkuCode());
                    inventoryResponse.setInStock(inventory.getQuantity() > 0);
                    return inventoryResponse;
                }).toList();
    }
}
