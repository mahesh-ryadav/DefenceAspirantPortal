package com.softpro.DefenceAspirantPortal.Authentication.services;

import com.softpro.DefenceAspirantPortal.Authentication.dto.LoginDto;
import com.softpro.DefenceAspirantPortal.Authentication.dto.LoginResponseDto;
import com.softpro.DefenceAspirantPortal.Authentication.entities.User;
import com.softpro.DefenceAspirantPortal.Authentication.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final SessionService sessionService;
    private final UserService userService;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public LoginResponseDto login(LoginDto loginDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginDto.getEmail(), loginDto.getPassword())
        );
        User user = (User)authentication.getPrincipal();
        String accessToken = jwtService.generateAccessToken(user);
        String refreshToken = jwtService.generateRefreshToken(user);
        //It will delete the last session if the limit is full else generate new session
        sessionService.generateNewSession(user, refreshToken);
        return new LoginResponseDto(user.getId(),accessToken,refreshToken);
    }

    public LoginResponseDto refreshToken(String refreshToken) {
        Long userId = jwtService.getUserIdFromToken(refreshToken);
        //for updateLastUsedAt date session in db... and validate
        sessionService.validateSession(refreshToken);

        User user = userService.getUserById(userId);
        String accessToken = jwtService.generateAccessToken(user);
        return new LoginResponseDto(user.getId(), accessToken, refreshToken);
    }
}
