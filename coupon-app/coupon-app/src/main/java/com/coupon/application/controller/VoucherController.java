package com.coupon.application.controller;


import com.coupon.application.model.Voucher;
import com.coupon.application.service.VoucherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoucherController {
    @GetMapping("generate/new")
    public Voucher generateNewVoucher(){
        Voucher voucher = VoucherService.generateNewVoucher();
        return voucher;
    }
}
