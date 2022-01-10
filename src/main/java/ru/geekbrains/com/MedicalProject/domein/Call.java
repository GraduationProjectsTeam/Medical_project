package ru.geekbrains.com.MedicalProject.domein;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;

@NoArgsConstructor
@Data
//@Entity
public class Call {
//    @Id
//    @Generated
    private Long callId;

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

    //TODO убрать метод после появление базы данных
    public void setCallId(Long id) {
        this.callId = id;
    }
}