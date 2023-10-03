package com.bootcoding.patient.utils;

import java.util.Random;

public class NameGenerator {
    public static String[] Name = {
            "Emma Smith", "Liam Johnson", "Olivia Brown",
            "Noah Williams", "Ava Jones", "Sophia Davis",
            "Isabella Miller", "Mason Wilson", "Mia Taylor",
            "Lucas Anderson", "Harper Martinez", "Elijah Jackson",
            "Amelia Thomas", "Ethan White", "Charlotte Harris",
            "Aiden Martin", "Abigail Thompson", "James Robinson",
            "Emily Hall", "Benjamin Lewis"
    };


    public static String getName() {
        Random random = new Random();
        return Name[random.nextInt(0, Name.length - 1)];
    }
}
