package com.rodrigoferreira.cleanarch.application.usercases;

import com.rodrigoferreira.cleanarch.application.gateways.UserGateway;
import com.rodrigoferreira.cleanarch.domain.entity.User;

public class CreateUserInteractor {

    private final UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User createUser(User user) {
        return userGateway.createUser(user);
    }
}
