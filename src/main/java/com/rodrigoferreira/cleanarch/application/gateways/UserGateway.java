package com.rodrigoferreira.cleanarch.application.gateways;

import com.rodrigoferreira.cleanarch.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
} 
