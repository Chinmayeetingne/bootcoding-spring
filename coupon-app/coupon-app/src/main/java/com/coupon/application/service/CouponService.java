package com.coupon.application.service;


import com.coupon.application.model.Coupon;
import com.coupon.application.model.User;
import com.coupon.application.repository.CouponRepository;
import com.coupon.application.utils.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
public class CouponService {
//    public int newCoupon(){
//        UUID uuid = UUID.randomUUID();
//        return uuid.toString();
//    }
//    public List<String> getNewCoupon(int quantity){
//        List<String> coupons = new ArrayList<>();
//        for(int i = 0; i < quantity; i++){
//            String newCoupon = newCoupon();
//            coupons.add(newCoupon);
//        }
//        return coupons;

//        public Coupon getDummyJson(){
//            return Coupon.builder()
//                    .id(couponService.newCoupon())
//                    .type("Voucher")
//                    .validFor(3).build();
//        }

    public boolean save(User user) {
        users.add(user);
        return true;
    }

    public boolean save(List<User> users) {
        for(User u: users){
            save(u);
        }
        return true;
    }

    private List<User> users = new ArrayList<>();

    public User getUser(int id) {
        for(User u: users){
            if(id == u.getId()){
                return u;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

    @Autowired
    private CouponRepository couponRepository;
    public List<Coupon> generateNewCoupon(int value) {
        List<Coupon>list= new ArrayList<>();
        for (int i = 0; i < value; i++) {
            Coupon coupon = Coupon.builder().title(GenerateCouponTitle.generateRandomCouponTitle())
                    .description(GenerateDescription.getRandomCouponDescription())
                    .coupon_code(GenerateCoupon.generateRandomCouponCode())
                    .validity_date(GenerateDate.randomDate())
                    .type(GenerateType.generateRandomCouponType())
                    .discount((int) GenerateDiscount.generateRandomCouponDiscount())
                    .category(GenerateCoupon.generateRandomCouponCode())
                    //.created_date(GenerateCreatedDate.generateRandomCouponCreatedDate())
                    .description(GenerateDescription.getRandomCouponDescription())
                    .isActive(GenerateIsActive.generateRandomCouponIsActive())
                    .status(StatusGenerator.getStatus()).build();
            list.add(coupon);
        }
        return couponRepository.saveAll(list);
    }


}

