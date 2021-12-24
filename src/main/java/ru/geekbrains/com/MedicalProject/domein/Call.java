package ru.geekbrains.com.MedicalProject.domein;

import lombok.NoArgsConstructor;
import lombok.NonNull;


import javax.persistence.Entity;
import java.util.Calendar;

@NoArgsConstructor
@Entity
public class Call {
    private Long ID;
    private Calendar callData; //генерируется
    private String SNILS;
    private String FamilyName;
    private String FirstName;
    private String FathersName;
    private Calendar bornData;
    @NonNull
    private String callAddress; //внимание! Заложить в логику вопрос по домашнему ли адресу пациент!
    private String district;
    private String symptoms;
    private String comments;
    private boolean resuscitation;
    private boolean child;
    private boolean payment; //не выводится в форму для заполнения
}
