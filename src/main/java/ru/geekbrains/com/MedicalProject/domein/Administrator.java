package ru.geekbrains.com.MedicalProject.domein;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Administrator {
    @Id
    private String adminTelNum;

    private String adminName;


}
