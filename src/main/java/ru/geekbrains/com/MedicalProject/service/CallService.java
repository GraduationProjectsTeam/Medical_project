package ru.geekbrains.com.MedicalProject.service;

import ru.geekbrains.com.MedicalProject.domein.Call;

import java.util.List;
import java.util.Optional;

public interface CallService {
    Optional<Call> findById(Long id);
    Call addCall(Call newCall);
    List<Call> findAll();
}
