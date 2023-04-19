package org.company.orders.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user")
    public String randomUserName() {
        return "I'm random user!)";
    }

}
