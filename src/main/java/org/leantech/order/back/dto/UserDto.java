package org.leantech.order.back.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserDto {

    Long id;

    String telegramId;

    String name;

    public static UserDto of(String name, String telegramId ) {
        return UserDto.builder()
                .name(name)
                .telegramId(telegramId)
                .build();
    }

    public static UserDto of(Long id, String name, String telegramId ) {
        return UserDto.builder()
                .id(id)
                .name(name)
                .telegramId(telegramId)
                .build();
    }

}
