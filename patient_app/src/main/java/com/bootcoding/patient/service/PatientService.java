package com.bootcoding.patient.service;

import com.bootcoding.patient.model.Patient;
import com.bootcoding.patient.repository.PatientRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
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
      @Autowired
       private PatientRepository patientRepository;
    public void saveDetails(Patient patient){
        patientRepository.save(patient);
    }

     public void saveUser(List<Patient> patient) {
        for(Patient data : patient){
            patientRepository.save(data);
        }
         }
}
