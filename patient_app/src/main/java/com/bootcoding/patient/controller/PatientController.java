package com.bootcoding.patient.controller;


import com.bootcoding.patient.model.Patient;
import com.bootcoding.patient.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient/")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("/patientDetails/{value}")
    public List<String> generateNewPatient(@PathVariable int value){
        return patientService.getNewPatients(value);
    }

    @PostMapping("register")
    public String register(@RequestBody List<Patient> patient){
        patientService.saveUser(patient);
        return "SUCCESS";
    }


    @GetMapping("all-patients")
    public List<String> getAllPatients(){
        int NoOfPatients = 10;
        return patientService.getNewPatients(NoOfPatients);
    }

    @GetMapping("patient/{name}")

    public String getPatientObjectById(@PathVariable("name") String patientName){
        String patient = PatientService.newPatient();
        return patient;
    }

}
