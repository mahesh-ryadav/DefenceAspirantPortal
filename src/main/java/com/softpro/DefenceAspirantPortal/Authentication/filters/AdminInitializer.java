package com.softpro.DefenceAspirantPortal.Authentication.filters;

import com.softpro.DefenceAspirantPortal.Authentication.dto.enums.Role;
import com.softpro.DefenceAspirantPortal.Authentication.entities.User;
import com.softpro.DefenceAspirantPortal.Authentication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class AdminInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) {
        if (!userRepository.existsByEmail("admin@gmail.com")) {
            User admin = new User();
            admin.setEmail("admin@gmail.com");
            admin.setPassword(passwordEncoder.encode("admin123"));
            Set<Role> roles = new HashSet<>();
            roles.add(Role.ADMIN); // Add ADMIN role
            admin.setRoles(roles);
            userRepository.save(admin);
            System.out.println("Admin user created: admin@gmail.com / admin123");
        } else {
            System.out.println("Admin user already exists.");
        }
    }
}

