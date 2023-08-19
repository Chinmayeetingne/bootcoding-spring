package com.bootcoding.patient.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Component
public class PatientService {
    public static String newPatient() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();

    }

    public List<String> getNewPatients(int noOfPatients) {
        List<String> patients = new ArrayList<>();
        for(int i = 0; i < noOfPatients; i++){
            String newPatient = newPatient();
            patients.add(newPatient);
        }
        return patients;

    }
}
