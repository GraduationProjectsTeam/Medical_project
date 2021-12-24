package ru.geekbrains.com.MedicalProject.domein;


import lombok.NonNull;

import java.util.Calendar;

public class CallDocument {
    private Long callID;
    private Calendar callData;
    private Calendar documentData;
    private String SNILS;
    private String FamilyName;
    private String FirstName;
    private String FathersName;
    private Calendar bornData;
    @NonNull
    private String callAddress;
    private String district;
    private String symptoms;
    private String help;
    private boolean resuscitation;
    private boolean child;
    private boolean hospitalization;
    private boolean payment;
}
