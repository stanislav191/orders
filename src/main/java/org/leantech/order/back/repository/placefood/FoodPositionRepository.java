package org.leantech.order.back.repository.placefood;

import org.leantech.order.back.model.order.FoodPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodPositionRepository extends JpaRepository<FoodPosition, Long> {
}
