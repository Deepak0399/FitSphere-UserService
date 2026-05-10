package com.fitness.userservice.service;

import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserResponse getUserProfile(String userId);

    UserResponse register(RegisterRequest request);

    Boolean existByUserId(String userId);
}
