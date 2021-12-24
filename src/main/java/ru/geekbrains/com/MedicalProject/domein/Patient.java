package ru.geekbrains.com.MedicalProject.domein;

import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import java.util.Calendar;

@NoArgsConstructor
@Entity
public class Patient {
    @NonNull
    private String SNILS;
    @NonNull
    private String FamilyName;
    @NonNull
    private String FirstName;
    private String FathersName;
    @NonNull
    private Calendar bornData;
    @NonNull
    private String homeAddress;
    private String district;
    private Calendar registrationData; //генерируется
    private int calls;                 //не выводится в форму для заполнения

}
