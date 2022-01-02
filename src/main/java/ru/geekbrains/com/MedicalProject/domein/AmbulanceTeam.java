package ru.geekbrains.com.MedicalProject.domein;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import java.util.Calendar;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AmbulanceTeam {
    @Generated
    private Long id;

    private Calendar dateOfChange; //генерируется
    @NonNull
    private String doctorName;

    private String teamNames; //в форме можно в 1 строчку или одним м.
    private String ambTelNum;

    private String ambDistrict;
    @NonNull
    private Long organisationId; //референс на организацию
}
