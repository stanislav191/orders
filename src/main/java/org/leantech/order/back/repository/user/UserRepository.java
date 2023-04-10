package org.leantech.order.back.repository.user;

import org.leantech.order.back.model.users.Employee;
import org.leantech.order.back.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Employee findByName(String name);
}
