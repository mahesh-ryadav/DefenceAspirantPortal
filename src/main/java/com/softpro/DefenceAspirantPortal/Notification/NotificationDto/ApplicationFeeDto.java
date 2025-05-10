package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import lombok.*;

import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApplicationFeeDto {
    private Double feeAmount;
    private Map<String, Double> categoryWiseFee; // keys: UR, OBC, SC, ST, Female
    private String paymentMode; // e.g. Online – Debit/Credit/UPI/NetBanking
}
