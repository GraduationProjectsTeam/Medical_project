package ru.geekbrains.com.MedicalProject.domein;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import java.util.Calendar;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AmbulanceTeam {
    @Generated
    private Long ID;
    @NonNull
    private String organisation;
    private Calendar dataOfChange; //генерируется
    @NonNull
    private String doctorName;
    private Map<String,String> teamNamesArr; //в форме написать еще 3-4 ячейки звание-фио
                                        // (либо кнопку для открытие граф по необходимости )
    private String district;
}
