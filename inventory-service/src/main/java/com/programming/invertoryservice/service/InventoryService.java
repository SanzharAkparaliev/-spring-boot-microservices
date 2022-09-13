package com.programming.invertoryservice.service;


import com.programming.invertoryservice.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;


    @Transactional(readOnly = true)
    public boolean isInStock(String scuCode){
        return inventoryRepository.findBySkuCode(scuCode).isPresent();
    }
}
