package org.leantech.order.back.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class FoodPositionDto {

    Long id;
    String name;
    Long placeOrderId;

    public static FoodPositionDto of(Long id, String name, Long placeOrderId) {
        return FoodPositionDto.builder()
                .id(id)
                .name(name)
                .placeOrderId(placeOrderId)
                .build();
    }

}
