package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "documents_required")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentsRequired {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "photo_signature_guidelines", length = 2000)
    private String photoSignatureGuidelines;

    @Column(name = "id_proof_requirements", length = 2000)
    private String idProofRequirements;

    @Column(name = "caste_certificate", length = 2000)
    private String casteCertificate;

    @Column(name = "domicile_ncc_sports_quota_documents", length = 2000)
    private String domicileNccSportsQuotaDocuments;
}
