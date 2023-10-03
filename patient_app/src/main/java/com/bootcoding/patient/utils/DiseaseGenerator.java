package com.bootcoding.patient.utils;

import java.util.Random;

public class DiseaseGenerator {
    public static String[] disease={
            "Flu",
            "Common Cold",
            "COVID-19",
            "Heart Disease",
            "Diabetes",
            "Hypertension",
            "Cancer",
            "Asthma",
            "Allergies"
    };
    public static String getDisease() {
        Random random = new Random();
        return disease[random.nextInt(0,disease.length-1)];
    }
}
