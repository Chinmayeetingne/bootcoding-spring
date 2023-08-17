package com.coupon.application;

import com.coupon.application.service.CouponService;
import com.coupon.application.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CouponAppApplication implements ApplicationRunner {

	public static void main(String[] args) {

		SpringApplication.run(CouponAppApplication.class, args);
	}
	@Autowired
	private CouponService couponService;

	@Autowired
	private VoucherService voucherService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String s = couponService.newCoupon();
		System.out.println("New Coupon : " + s);
	}
	}

