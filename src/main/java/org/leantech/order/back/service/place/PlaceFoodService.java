package org.leantech.order.back.service.place;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.leantech.order.back.dto.PlaceOrderDto;
import org.leantech.order.back.model.order.PlaceOrder;
import org.leantech.order.back.repository.placefood.PlaceFoodRepository;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
public class PlaceFoodService {

    PlaceFoodRepository placeFoodRepository;

    public PlaceOrderDto createPlaceOrder(final PlaceOrderDto placeOrderDto) {
        var placeOrder = PlaceOrder.builder().name(placeOrderDto.getPlaceName()).build();

        var savedPlaceOrder = placeFoodRepository.save(placeOrder);
        log.info("Saved place order : {}", savedPlaceOrder);

        return PlaceOrderDto.of(savedPlaceOrder.getId(), savedPlaceOrder.getName());
    }

    public PlaceOrderDto getPlaceOrderByName(final String name) {
        var placeOrder = placeFoodRepository.findByName(name);
        log.info("Got place order : {}", placeOrder);
        return PlaceOrderDto.of(placeOrder.getId(), placeOrder.getName());
    }

}
