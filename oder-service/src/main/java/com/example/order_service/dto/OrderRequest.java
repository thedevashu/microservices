package com.example.order_service.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

public class OrderRequest {
    private List<OrderLineItemsDto> orderLineItemsDto;

    public List<OrderLineItemsDto> getOrderLineItemsDto() {
        return orderLineItemsDto;
    }

    public void setOrderLineItemsDto(List<OrderLineItemsDto> orderLineItemsDto) {
        this.orderLineItemsDto = orderLineItemsDto;
    }
}
