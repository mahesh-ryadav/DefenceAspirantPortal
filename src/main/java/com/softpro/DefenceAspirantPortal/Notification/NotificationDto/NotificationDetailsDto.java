package com.softpro.DefenceAspirantPortal.Notification.NotificationDto;

import com.softpro.DefenceAspirantPortal.Notification.NotificationDto.BasicExamInfoDto;
import com.softpro.DefenceAspirantPortal.Notification.NotificationDto.ImportantDatesDto;
import com.softpro.DefenceAspirantPortal.Notification.NotificationDto.EligibilityCriteriaDto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NotificationDetailsDto {
    private Long id;
    private BasicExamInfoDto basicExamInfoDto = new BasicExamInfoDto();
    private ImportantDatesDto importantDatesDto = new ImportantDatesDto();
    private EligibilityCriteriaDto eligibilityCriteriaDto = new EligibilityCriteriaDto();
    private VacancyDetailsDto vacancyDetailsDto = new VacancyDetailsDto();
    private ApplicationFeeDto applicationFeeDto = new ApplicationFeeDto();
    private SelectionProcessDto selectionProcessDto = new SelectionProcessDto();
    private ExamPatternDto examPatternDto = new ExamPatternDto();
    private SyllabusDto syllabusDto = new SyllabusDto();
    private PhysicalMedicalStandardsDto physicalMedicalStandardsDto = new PhysicalMedicalStandardsDto();
    private DocumentsRequiredDto documentsRequiredDto = new DocumentsRequiredDto();
    private HowToApplyDto howToApplyDto = new HowToApplyDto();

}
