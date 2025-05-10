package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "selection_process")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SelectionProcess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "written_test")
    private String writtenTest;

    @Column(name = "ssb_interview")
    private String ssbInterview;

    @Column(name = "document_verification")
    private String documentVerification;

    @Column(name = "medical_examination")
    private String medicalExamination;

    @Column(name = "final_merit")
    private String finalMerit;
}
