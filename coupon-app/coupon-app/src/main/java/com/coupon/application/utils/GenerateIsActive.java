package com.coupon.application.utils;

import java.util.Random;

public class GenerateIsActive {
    public static boolean generateRandomCouponIsActive() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
