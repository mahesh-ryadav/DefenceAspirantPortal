package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamPatternDto {
    private Integer numberOfPapers;
    private String subjectWisePaperDetails; // Can be changed to Map<String, String> if needed
    private String durationOfEachPaper;
    private Integer totalMarks;
    private Boolean negativeMarking;
    private Integer minimumQualifyingMarks;
}
