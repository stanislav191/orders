package org.leantech.order.back.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PlaceOrderDto {

    Long id;
    String placeName;

    public static PlaceOrderDto of(String name) {
        return PlaceOrderDto.builder().placeName(name).build();
    }

    public static PlaceOrderDto of(Long id, String name) {
        return PlaceOrderDto.builder().id(id).placeName(name).build();
    }

}
