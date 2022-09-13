package com.programming.invertoryservice;

import com.programming.invertoryservice.model.Inventory;
import com.programming.invertoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InvertoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvertoryServiceApplication.class, args);
    }


    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository){
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setQuantity(100);
            inventory.setSkuCode("iphone_13");


            Inventory inventory1 = new Inventory();
            inventory.setQuantity(0);
            inventory.setSkuCode("iphone_13_red");

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory1);
        };
    }
}
