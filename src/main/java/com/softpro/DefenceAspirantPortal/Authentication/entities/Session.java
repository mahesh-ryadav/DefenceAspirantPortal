package com.softpro.DefenceAspirantPortal.Authentication.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String refreshToken;
    @CreationTimestamp
    private LocalDateTime lastUsedAt;

    @ManyToOne //Many Session one User //0r one user have multiple session
    private User user;
}
