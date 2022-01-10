package ru.geekbrains.com.MedicalProject.controller;

import lombok.RequiredArgsConstructor;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.com.MedicalProject.domein.Call;
import ru.geekbrains.com.MedicalProject.service.CallService;

import java.util.List;
import java.util.Optional;


//@RequiredArgsConstructor
@RestController
public class CallController {
    private CallService callService;

    @GetMapping("/calls/{id}") //
    public Call findById(@PathVariable Long id) {
        Call returnCall = callService.findById(id).orElseThrow(() -> new NullPointerException());
        return returnCall;
    }

    @PostMapping("/calls")
    public Call addCall(@PathVariable Call newCall) { return callService.addCall(newCall); }

    @GetMapping("/calls")
    public List<Call> findAll() {
        return callService.findAll();
    }

    @DeleteMapping("/calls/{id}")
    public Call deleteById(@PathVariable Long id) {return callService.deleteById(id);}

    @PutMapping("/calls/{id}")
    public Call updateById(@PathVariable Long id) {return callService.updateById(id)}
}
