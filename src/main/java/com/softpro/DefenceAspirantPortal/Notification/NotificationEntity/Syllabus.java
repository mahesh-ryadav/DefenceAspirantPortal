package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "syllabus")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Syllabus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "english_topics", length = 2000)
    private String englishTopics;

    @Column(name = "mathematics_topics", length = 2000)
    private String mathematicsTopics;

    @Column(name = "general_knowledge_topics", length = 2000)
    private String generalKnowledgeTopics;

    @Column(name = "reasoning_topics", length = 2000)
    private String reasoningTopics;

    @Column(name = "technical_subjects_topics", length = 2000)
    private String technicalSubjectsTopics;

    @Column(name = "syllabus_pdf_link")
    private String syllabusPdfLink;
}
