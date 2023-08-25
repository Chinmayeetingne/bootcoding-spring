package com.coupon.application.utils;

import java.util.Random;

public class GenerateDescription {
    private static String[] descriptions = {
            "Get a discount on your next purchase!",
            "Limited-time offer for amazing savings.",
            "Shop now and save big with this coupon.",
            "Don't miss out on this exclusive deal.",
            "Enjoy special discounts with this promo code.",
            "Unlock fantastic savings with this offer."
    };

    public static String getRandomCouponDescription() {
        Random random = new Random();
        int randomIndex = random.nextInt(descriptions.length);
        return descriptions[randomIndex];
    }
}
