package org.leantech.order.back.service.user;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.leantech.order.back.repository.user.UserRepository;
import org.leantech.order.back.dto.UserDto;
import org.leantech.order.back.model.users.Employee;
import org.springframework.stereotype.Service;

@Log4j2
@Service
@AllArgsConstructor
public class UserService {

    UserRepository userRepository;

    public UserDto createUser(UserDto userDto) {
        var userRep = Employee.of(userDto.getName(), userDto.getTelegramId());

        var savedUser = userRepository.save(userRep);

        return UserDto.of(savedUser.getId(), savedUser.getName(), savedUser.getTelegramId());
    }

    public UserDto getUserById(Long id) {
        var result = userRepository.findById(id);
        return UserDto.of(result.get().getId(), result.get().getName(), result.get().getTelegramId());
    }

    public UserDto getUserByName(String name) {
        var result = (Employee) userRepository.findByName(name);
        return UserDto.of(result.getId(), result.getName(), result.getTelegramId());
    }

}
