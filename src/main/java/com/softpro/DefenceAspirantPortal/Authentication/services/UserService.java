package com.softpro.DefenceAspirantPortal.Authentication.services;

import com.softpro.DefenceAspirantPortal.Authentication.dto.SignUpDto;
import com.softpro.DefenceAspirantPortal.Authentication.dto.UserDto;
import com.softpro.DefenceAspirantPortal.Authentication.entities.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDto signUp(@Valid SignUpDto user);

    User getUserById(Long userId);
}
