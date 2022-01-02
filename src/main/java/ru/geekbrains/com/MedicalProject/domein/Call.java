package ru.geekbrains.com.MedicalProject.domein;

import lombok.NoArgsConstructor;
import lombok.NonNull;


import javax.persistence.Entity;
import java.util.Calendar;

@NoArgsConstructor
@Entity
public class Call {
    private Long CallId;

    private Calendar callData; //генерируется

    private String patientSNILS;

    private String patientFamilyName;

    private String patientFirstName;

    private String patientFathersName;

    private Calendar patientBornData;
    @NonNull
    private String patientTelNum;
    @NonNull
    private String callAddress; //внимание! Заложить в логику вопрос по домашнему ли адресу пациент!

    private String callDistrict;

    private String symptoms;

    private String comments;

    private boolean needResuscitation;

    private boolean callForChild;
}