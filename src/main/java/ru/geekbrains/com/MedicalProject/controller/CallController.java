package ru.geekbrains.com.MedicalProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.com.MedicalProject.domein.Call;

import java.util.List;
//@RequiredArgsConstructor
@RestController
public class CallController {
    private final CallService callService;

    @GetMapping("/calls/{id}") //TODO опшионал!!!
    public Call findById(@PathVariable Long id) {
            return callService.findById(id);
        }

    @GetMapping("/calls")
    public List<Call> findAll() {
            return callService.findAll();
        }

    @PostMapping("/calls")
    public Call addCall() { return callService.addCall(); }

    @DeleteMapping("/calls/{id}")
    public Call deleteById(@PathVariable Long id) {return callService.deleteById(id);}

    @PutMapping("/calls/{id}")
    public Call update(@PathVariable Long id) {return callService.update(id)}




}
