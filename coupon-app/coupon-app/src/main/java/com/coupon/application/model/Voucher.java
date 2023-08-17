package com.coupon.application.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Voucher {
    private String id;
    private String title;
    private int validFor;
    private String category;
    private int discount;
}
