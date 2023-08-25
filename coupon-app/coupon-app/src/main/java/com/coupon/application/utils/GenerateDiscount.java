package com.coupon.application.utils;

import java.util.Random;

public class GenerateDiscount {
    public static double generateRandomCouponDiscount() {
        Random random = new Random();

        // Define the range of possible discount values
        double minDiscount = 5.0;
        double maxDiscount = 50.0;

        // Generate a random discount value within the specified range
        return minDiscount + (maxDiscount - minDiscount) * random.nextDouble();
    }

}
