package org.leantech.order.back.service.place;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.leantech.order.back.dto.FoodPositionDto;
import org.leantech.order.back.model.order.FoodPosition;
import org.leantech.order.back.model.order.PlaceOrder;
import org.leantech.order.back.repository.placefood.FoodPositionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@Service
@AllArgsConstructor
public class FoodPositionService {

    FoodPositionRepository foodPositionRepository;

    public List<FoodPositionDto> create(final List<FoodPositionDto> foodPositionDto) {
        foodPositionDto.stream()
                .map(this::getConvertedFoodPosition)
                .forEach(fPosition -> foodPositionRepository.save(fPosition));

        return new ArrayList<>();
    }

    private FoodPosition getConvertedFoodPosition(FoodPositionDto foodPositionDto) {
        return FoodPosition.builder().id(foodPositionDto.getId())
                .name(foodPositionDto.getName())
                .placeOrder(PlaceOrder.builder().id(foodPositionDto.getId()).build())
                .build();
    }

    private FoodPositionDto getConvertedFoodPositionDto(FoodPosition foodPositionDto) {
        return FoodPositionDto.builder().id(foodPositionDto.getId())
                .name(foodPositionDto.getName())
                .placeOrderId(foodPositionDto.getPlaceOrder().getId())
                .build();
    }


}
