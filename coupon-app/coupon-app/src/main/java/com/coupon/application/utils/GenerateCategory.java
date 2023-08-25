package com.coupon.application.utils;


import java.util.Random;

public class GenerateCategory {
    private static String[] categories = {"Electronics", "Fashion", "Groceries", "Travel", "Home", "Entertainment"};

    public static String getRandomCouponCategory() {
        Random random = new Random();
        int randomIndex = random.nextInt(categories.length);
        return categories[randomIndex];
    }
}
