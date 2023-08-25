package com.coupon.application.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;

public class GenerateCreatedDate {
    public static LocalDateTime generateRandomCouponCreatedDate() {
        Random random = new Random();
        LocalDate currentDate = LocalDate.now();

        // Generate a random number of days between 1 and 365
        int daysAgo = random.nextInt(365) + 1;
        LocalDate createdDate = currentDate.minusDays(daysAgo);

        // Generate a random time for the created date (between 00:00:00 and 23:59:59)
        int hour = random.nextInt(24);
        int minute = random.nextInt(60);
        int second = random.nextInt(60);
        LocalTime createdTime = LocalTime.of(hour, minute, second);

        return createdDate.atTime(createdTime);
    }
}