package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "exam_pattern")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExamPattern {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_of_papers")
    private Integer numberOfPapers;

    @Column(name = "subject_wise_paper_details", length = 2000)
    private String subjectWisePaperDetails; // Can be changed to a more complex type if needed

    @Column(name = "duration_of_each_paper")
    private String durationOfEachPaper;

    @Column(name = "total_marks")
    private Integer totalMarks;

    @Column(name = "negative_marking")
    private Boolean negativeMarking;

    @Column(name = "minimum_qualifying_marks")
    private Integer minimumQualifyingMarks;
}
