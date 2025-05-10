package com.softpro.DefenceAspirantPortal.Notification.NotificationEntity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Map;
@Entity
@Table(name = "vacancy_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VacancyDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int totalVacancies;

    @ElementCollection
    @CollectionTable(name = "category_wise_vacancy", joinColumns = @JoinColumn(name = "vacancy_details_id"))
    @MapKeyColumn(name = "category")
    @Column(name = "vacancy_count")
    private Map<String, Integer> categoryWiseVacancy;

    @ElementCollection
    @CollectionTable(name = "post_wise_vacancy", joinColumns = @JoinColumn(name = "vacancy_details_id"))
    @MapKeyColumn(name = "post_name")
    @Column(name = "vacancy_count")
    private Map<String, Integer> postWiseVacancy;
}
