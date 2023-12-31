package com.coupon.application.controller;


import com.coupon.application.model.Coupon;
import com.coupon.application.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupon/")
public class CouponController {
  @Autowired
    private CouponService couponService;
  @PostMapping("/couponDetails/{value}")
  public List<Coupon> generateNewCoupon(@PathVariable int value ) {
    return couponService.generateNewCoupon(value);
  }


//  1.Get all coupons
//
//  @GetMapping("all-coupons")
//  public List<String> getAllCoupons(){
//      int quantity = 10;
//      return couponService.getNewCoupon(quantity);

//  }

    // 2. Get Coupon Details by Coupon Id using PathVariable
//    @GetMapping("coupon-id/{id}")
//    public String getCouponById(@PathVariable("id") String couponId){
//        return couponId + "-" + couponService.newCoupon();
//    }

    // 2.2 Get Coupon Details by Coupon Id using PathVariable
    //@GetMapping("coupon-id/{id}")
    //public Coupon getCouponObjectById(@PathVariable("id") String couponId){
      //  Coupon coupon = couponService.generateNewCoupon();
        //return coupon;
    //}

//    @GetMapping("generate/new")
//    public Coupon generateNewCoupon(){
//        Coupon coupon = couponService.generateNewCoupon();
//        return coupon;
//    }


    // 3. Get Coupons with Filter (Query Parameter)
    @GetMapping("search_coupon")
    public String searchCoupon(
            @RequestParam("valid") boolean isValid,
            @RequestParam(value = "type", required = false) String couponType,
            @RequestParam("category") String category){
        return "Query Parameter valid = " + isValid
                + " | Coupon Type = " + couponType
                + " | Coupon Category = " + category;
    }

    // HTTP Methods Get
//    @GetMapping("getCoupon")
//    public String newCoupon(){
//        return "New Coupon : " + couponService.newCoupon();
//    }

//    @GetMapping("getJson")
//    public Coupon getDummyJson(){
//        return Coupon.builder()
//                .id(couponService.newCoupon())
//                .category("Voucher")s
//                .validity_date().build();
//    }

//    @GetMapping("getMultipleCoupons")
//    public List<String> newCouponWithQuantity(){
//        int quantity = 10;
//        return couponService.getNewCoupon(quantity);
//    }
//    // http://localhost:8080/app-name/coupon/getCoupon

}
