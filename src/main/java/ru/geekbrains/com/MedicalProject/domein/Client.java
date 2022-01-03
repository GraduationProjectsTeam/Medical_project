package ru.geekbrains.com.MedicalProject.domein;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
    private String login;
    private String pass;
    private String status;
}
