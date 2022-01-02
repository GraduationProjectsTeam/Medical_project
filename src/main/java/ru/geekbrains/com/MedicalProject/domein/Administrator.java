package ru.geekbrains.com.MedicalProject.domein;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Administrator {
    @NonNull
    private String adminTelNum;

    private String adminName;


}
