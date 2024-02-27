package ru.javabegin.micro.planner.plannertodo.feign;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import ru.javabegin.micro.planner.plannerentity.entity.User;

@Component
class UserFeignClientFallback implements UserFeignClient {

    // этот метод будет вызываться, если сервис /user/id не будет доступен
    @Override
    public ResponseEntity<User> findUserById(Long id) {
        return null;
    }
}