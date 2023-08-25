package com.bootcoding.patient.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Entity
public class Patient {
    @Column(name = "Patient_name")
    private String name;

    private int age;
    private String disease;
    private long phone;
    @Id
    @GeneratedValue
    private int id;
}
