package com.bootcoding.patient.utils;

import java.util.Random;

public class AgeGenerator {
    public static void main(String[] args) {
        int minDiscount = 10; // Minimum Age
        int maxDiscount = 80; // Maximum Age

        int randomAge = generateRandomAge(minDiscount, maxDiscount);
        System.out.println("Random Age: " + randomAge + "%");
    }

    public static int generateRandomAge(int minAge, int maxAge) {
        Random random = new Random();
        return random.nextInt(maxAge - minAge + 1) + minAge;
    }
}
