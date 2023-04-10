package org.leantech.order.back.controller;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.leantech.order.back.dto.PlaceOrderDto;
import org.leantech.order.back.service.place.PlaceFoodService;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@AllArgsConstructor
public class PlaceFoodController {

    PlaceFoodService placeFoodService;

    @PostMapping("/create/place")
    public PlaceOrderDto create(@RequestBody PlaceOrderDto placeOrderDto) {
        log.info("Creating place: {}", placeOrderDto);
        return placeFoodService.createPlaceOrder(placeOrderDto);
    }

    @GetMapping("/get/place/{name}")
    public PlaceOrderDto getPlaceFoodByName(@PathVariable String name) {
        log.info("Getting place food by name: {}", name);
        return placeFoodService.getPlaceOrderByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {

    }


}
