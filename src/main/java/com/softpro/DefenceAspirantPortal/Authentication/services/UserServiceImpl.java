package com.softpro.DefenceAspirantPortal.Authentication.services;

import com.softpro.DefenceAspirantPortal.Authentication.dto.SignUpDto;
import com.softpro.DefenceAspirantPortal.Authentication.dto.UserDto;
import com.softpro.DefenceAspirantPortal.Authentication.entities.User;
import com.softpro.DefenceAspirantPortal.Authentication.repositories.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username)
                .orElseThrow(() -> new BadCredentialsException("User with email"+ username +" not found!"));
    }

    @Override
    public User getUserById(Long userId){
        return userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User with Id"+ userId +" is not found!"));
    }

    @Override
    public UserDto signUp(@Valid SignUpDto userDto) {
        System.out.println("hello bksdk");
        Optional<User> user1 =  userRepository.findByEmail(userDto.getEmail());
        if(user1.isPresent()){
            throw new BadCredentialsException("User with email is already present.");
        }
        User user = mapper.map(userDto, User.class);
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        userRepository.save(user);
        System.out.println(user);
        return mapper.map(user, UserDto.class);
    }
}
