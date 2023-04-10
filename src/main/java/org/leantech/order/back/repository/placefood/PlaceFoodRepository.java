package org.leantech.order.back.repository.placefood;

import org.leantech.order.back.model.order.PlaceOrder;
import org.leantech.order.back.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlaceFoodRepository extends JpaRepository<PlaceOrder, Long> {

    PlaceOrder findByName(String name);

}
