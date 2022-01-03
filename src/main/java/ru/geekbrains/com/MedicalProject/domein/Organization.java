package ru.geekbrains.com.MedicalProject.domein;

import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;

@NoArgsConstructor
@Entity
public class Organization {
    @Id
    @Generated
    private Long organizationId;

    private String organizationName;

    private String organizationTelNum;

    private Calendar registrationDate;
}
