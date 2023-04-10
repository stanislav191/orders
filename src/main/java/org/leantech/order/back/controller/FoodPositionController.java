package org.leantech.order.back.controller;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.leantech.order.back.dto.FoodPositionDto;
import org.leantech.order.back.dto.PlaceOrderDto;
import org.leantech.order.back.service.place.FoodPositionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Log4j2
@RestController
@AllArgsConstructor
public class FoodPositionController {

    FoodPositionService foodPositionService;

    @PostMapping("/create/position")
    public List<FoodPositionDto> create(@RequestBody List<FoodPositionDto> foodPositionDto) {
        log.info("Creating place: {}", foodPositionDto);
        return foodPositionService.create(foodPositionDto);
    }

}
