package ru.geekbrains.com.MedicalProject.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.geekbrains.com.MedicalProject.domein.Call;
import ru.geekbrains.com.MedicalProject.repository.CallRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CallServiceImpl implements CallService {

    private CallRepository callRepository;

    public Optional<Call> findById(Long id){
        return callRepository.findById(id);
    }

    public Call addCall(Call newCall){
        return callRepository.addCall(newCall);
    }

    public List<Call> findAll(){
        return callRepository.findAll();
    }
}
