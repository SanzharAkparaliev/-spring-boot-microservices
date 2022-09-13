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


  }
