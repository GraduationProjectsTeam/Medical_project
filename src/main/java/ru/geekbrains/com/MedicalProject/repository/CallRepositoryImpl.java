package ru.geekbrains.com.MedicalProject.repository;

import ru.geekbrains.com.MedicalProject.domein.Call;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public class CallRepositoryImpl {
    //TODO repository
    private Map<Integer,Call> map;
    private Integer COUNT;

    public Optional<Call> findById(Long id){
        return Optional.of(map.get(id));
    }
    public Call addCall(Call newCall){
        if(COUNT==null){
            COUNT=1;
        }
        newCall.setCallId(Long.valueOf(COUNT));
        map.put(COUNT,newCall);
        COUNT++;
        return newCall;
    }

    public List<Call> findAll(){
        List calls = List.of(map.values());
        return calls;
    }
}
