package ru.geekbrains.com.MedicalProject.repository;

import org.springframework.stereotype.Repository;
import ru.geekbrains.com.MedicalProject.domein.Call;

import java.util.List;
import java.util.Optional;

@Repository
public interface CallRepository {

    Optional<Call> findById(Long id);

    Call addCall(Call newCall);

    List<Call> findAll();
}
