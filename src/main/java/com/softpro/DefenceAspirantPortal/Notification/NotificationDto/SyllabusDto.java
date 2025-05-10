package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SyllabusDto {
    private String englishTopics;
    private String mathematicsTopics;
    private String generalKnowledgeTopics;
    private String reasoningTopics;
    private String technicalSubjectsTopics;
    private String syllabusPdfLink;
}
