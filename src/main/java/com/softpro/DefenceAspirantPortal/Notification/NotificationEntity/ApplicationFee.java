package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Map;

@Entity
@Table(name = "application_fee")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApplicationFee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fee_amount")
    private Double feeAmount;

    @ElementCollection
    @CollectionTable(name = "category_wise_fee", joinColumns = @JoinColumn(name = "application_fee_id"))
    @MapKeyColumn(name = "category")
    @Column(name = "fee")
    private Map<String, Double> categoryWiseFee;

    @Column(name = "payment_mode")
    private String paymentMode;
}
