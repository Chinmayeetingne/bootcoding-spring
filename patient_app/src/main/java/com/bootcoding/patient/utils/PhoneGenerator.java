package com.bootcoding.patient.utils;

import java.util.UUID;

public class PhoneGenerator {
    public static int getPhone() {
        return (int) (UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE) % 90000000 + 1000000000;
    }

}
