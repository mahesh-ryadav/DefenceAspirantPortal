package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//import com.softpro.DefenceAspirantPortal.Notification.NotificationEntity.DocumentsRequired;
//import com.softpro.DefenceAspirantPortal.Notification.NotificationEntity.HowToApply;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificationDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//     @OneToOne(cascade = CascadeType.ALL)
//     @JoinColumn(name = "basic_exam_info_id", referencedColumnName = "id")
//     private BasicExamInfo basicExamInfo;

//     @OneToOne(cascade = CascadeType.ALL)
//     @JoinColumn(name = "important_dates_id", referencedColumnName = "id")
//     private ImportantDates importantDates;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "eligibility_criteria_id", referencedColumnName = "id")
//    private EligibilityCriteria eligibilityCriteria;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "vacancy_details_id", referencedColumnName = "id")
//    private VacancyDetails vacancyDetails;

    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "application_fee_id", referencedColumnName = "id")
    // private ApplicationFee applicationFee;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "selection_process_id", referencedColumnName = "id")
//    private SelectionProcess selectionProcess;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "exam_pattern_id", referencedColumnName = "id")
//    private ExamPattern examPattern;

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "syllabus_id", referencedColumnName = "id")
   private Syllabus syllabus;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "physical_medical_standards_id", referencedColumnName = "id")
//    private PhysicalMedicalStandards physicalMedicalStandards;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "documents_required_id", referencedColumnName = "id")
//    private DocumentsRequired documentsRequired;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "how_to_apply_id", referencedColumnName = "id")
//    private HowToApply howToApply;
}
