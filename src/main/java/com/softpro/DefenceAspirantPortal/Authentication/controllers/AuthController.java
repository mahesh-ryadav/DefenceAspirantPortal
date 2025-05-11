package com.softpro.DefenceAspirantPortal.Authentication.controllers;


import com.softpro.DefenceAspirantPortal.Authentication.dto.LoginDto;
import com.softpro.DefenceAspirantPortal.Authentication.dto.LoginResponseDto;
import com.softpro.DefenceAspirantPortal.Authentication.dto.SignUpDto;
import com.softpro.DefenceAspirantPortal.Authentication.dto.UserDto;
import com.softpro.DefenceAspirantPortal.Authentication.services.AuthService;
import com.softpro.DefenceAspirantPortal.Authentication.services.UserService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final UserService userService;
    private final AuthService authService;

    @PostMapping("/signUp")
    public ResponseEntity<UserDto> signUp(@RequestBody SignUpDto signUpDto){
        UserDto userDto = userService.signUp(signUpDto);
        return ResponseEntity.ok(userDto);
    }

    @GetMapping("/login")
    public  String ShowLogin(){
        return "Authentication/login";
    }
    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login (@RequestBody LoginDto loginDto, HttpServletRequest request,
                                                   HttpServletResponse response){
        LoginResponseDto loginResponseDto = authService.login(loginDto);

        Cookie cookie = new Cookie("refreshToken", loginResponseDto.getRefreshToken());
        cookie.setHttpOnly(true);
        response.addCookie(cookie);

        return ResponseEntity.ok(loginResponseDto);
    }

    @PostMapping("/refresh")
    public ResponseEntity<LoginResponseDto> refresh(HttpServletRequest request){
        String refreshToken = Arrays.stream(request.getCookies())
                .filter(cookie -> "refreshToken".equals(cookie.getName()))
                .findFirst()
                .map(cookie -> cookie.getValue())
                .orElseThrow(()-> new AuthenticationServiceException("Refresh token not found inside the cookies."));
        LoginResponseDto loginResponseDto = authService.refreshToken(refreshToken);
        return ResponseEntity.ok(loginResponseDto);
    }
}
