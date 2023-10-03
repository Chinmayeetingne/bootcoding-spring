package com.bootcoding.patient.utils;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class AdmissionDateGenerator {
    public static Date randomDate() {
        long aDay = TimeUnit.DAYS.toMillis(1); // 1 day
        long now = new Date().getTime(); // current time
        Date yesterday = new Date(now - aDay);
        Date aYearAgo = new Date(now - aDay * 365);
        return between(aYearAgo, yesterday);
    }


    public static Date between(Date startInclusive, Date endExclusive) {
        Random random = new Random();

        // Generate a random timestamp between 946684800000 (2000-01-01) and 1672220400000 (2023-12-31)
        long start = startInclusive.getTime();
        long end = endExclusive.getTime();
        long randomTimestamp = ThreadLocalRandom
                .current()
                .nextLong(start,end);

        return new Date(randomTimestamp);
    }
}
