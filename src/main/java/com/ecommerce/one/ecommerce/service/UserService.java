package com.ecommerce.one.ecommerce.service;

import com.ecommerce.one.ecommerce.domain.User;

import java.util.Optional;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User saveUser(User user);

}
