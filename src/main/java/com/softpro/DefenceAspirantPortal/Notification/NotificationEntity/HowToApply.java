package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "how_to_apply")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HowToApply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "step_by_step_procedure", length = 2000)
    private String stepByStepProcedure;

    @Column(name = "screenshot_visual_demo_link")
    private String screenshotVisualDemoLink;

    @Column(name = "application_page_link")
    private String applicationPageLink;
}
