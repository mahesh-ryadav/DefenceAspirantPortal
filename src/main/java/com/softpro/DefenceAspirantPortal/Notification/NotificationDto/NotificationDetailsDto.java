package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationDetailsDto {
    private Long id;

    @Builder.Default
    private BasicExamInfoDto basicExamInfoDto = new BasicExamInfoDto();
    
    @Builder.Default
    private ImportantDatesDto importantDatesDto = new ImportantDatesDto();
    
    @Builder.Default
    private EligibilityCriteriaDto eligibilityCriteriaDto = new EligibilityCriteriaDto();
    
    @Builder.Default
    private VacancyDetailsDto vacancyDetailsDto = new VacancyDetailsDto();
    
    @Builder.Default
    private ApplicationFeeDto applicationFeeDto = new ApplicationFeeDto();
    
    @Builder.Default
    private SelectionProcessDto selectionProcessDto = new SelectionProcessDto();
    
    @Builder.Default
    private ExamPatternDto examPatternDto = new ExamPatternDto();
    
    @Builder.Default
    private SyllabusDto syllabusDto = new SyllabusDto();
    
    @Builder.Default
    private PhysicalMedicalStandardsDto physicalMedicalStandardsDto = new PhysicalMedicalStandardsDto();
    
    @Builder.Default
    private DocumentsRequiredDto documentsRequiredDto = new DocumentsRequiredDto();
    
    @Builder.Default
    private HowToApplyDto howToApplyDto = new HowToApplyDto();
}