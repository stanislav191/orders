package org.leantech.order.back.model.users;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Employee extends User {

    public static Employee of(String name, String telegramId) {
        return Employee.builder()
                .name(name)
                .telegramId(telegramId)
                .build();
    }

    public static Employee of(Long id, String name, String telegramId) {
        return Employee.builder()
                .id(id)
                .name(name)
                .telegramId(telegramId)
                .build();
    }
}
