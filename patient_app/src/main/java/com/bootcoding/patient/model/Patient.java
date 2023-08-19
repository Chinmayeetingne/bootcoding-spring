package com.bootcoding.patient.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Patient {
    private String name;
    private int age;
    private String disease;
    private long phone;
}
