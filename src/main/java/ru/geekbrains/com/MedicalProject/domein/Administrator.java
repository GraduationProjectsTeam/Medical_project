package ru.geekbrains.com.MedicalProject.domein;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Administrator {
    private String login;
    private String password;
}
