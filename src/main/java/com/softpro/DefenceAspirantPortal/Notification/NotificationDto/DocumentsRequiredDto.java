package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentsRequiredDto {
    private String photoSignatureGuidelines;
    private String idProofRequirements;
    private String casteCertificate;
    private String domicileNccSportsQuotaDocuments;
}
