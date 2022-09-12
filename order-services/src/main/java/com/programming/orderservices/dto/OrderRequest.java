package com.programming.orderservices.dto;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
