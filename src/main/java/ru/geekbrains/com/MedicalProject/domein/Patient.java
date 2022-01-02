package ru.geekbrains.com.MedicalProject.domein;

import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import java.util.Calendar;

@NoArgsConstructor
@Entity
public class Patient {
    @NonNull
    private String patientSNILS;
    @NonNull
    private String patientFamilyName;
    @NonNull
    private String patientFirstName;

    private String patientFathersName;
    @NonNull
    private Calendar patientBornDate;

    private char patientSex;
    @NonNull
    private String patientTelNum;

    private String patientHomeAddress;

    private String patientDistrict;

    private Calendar patientRegistrationDate; //генерируется

    private int patientCalls;                 //не выводится в форму для заполнения

}
