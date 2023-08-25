package com.coupon.application.utils;

import java.time.LocalDate;
import java.util.Random;

public class GenerateValidityDate {
    public static LocalDate generateRandomCouponValidityDate() {
        Random random = new Random();
        LocalDate currentDate = LocalDate.now();

        // Generate a random number of days between 7 and 90
        int daysToAdd = random.nextInt(84) + 7;

        // Add the random number of days to the current date to get the validity date
        return currentDate.plusDays(daysToAdd);
    }
}
