package com.programming.orderservices.controller;

import com.programming.orderservices.dto.OrderRequest;
import com.programming.orderservices.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        System.out.println(orderRequest.toString());
        orderService.placeOrder(orderRequest);
        return "Order Placed Seccessfully";
    }
}
