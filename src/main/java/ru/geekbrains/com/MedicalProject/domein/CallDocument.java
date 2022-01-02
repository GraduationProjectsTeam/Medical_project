package ru.geekbrains.com.MedicalProject.domein;


import lombok.NonNull;

import java.util.Calendar;

public class CallDocument {
    private Long callId;

    private Calendar callDate;

    private Calendar documentDate;

    private String patientSNILS;

    private String patientFamilyName;

    private String patientFirstName;

    private String patientFathersName;

    private Calendar patientBornDate;
    @NonNull
    private String callAddress;

    private String callDistrict;

    private String symptoms;

    private String ambHelp;

    private boolean needResuscitation;

    private boolean callForChild;

    private boolean patientHospitalization;

    private boolean payment;
}
