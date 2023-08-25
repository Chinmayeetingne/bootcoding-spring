package com.coupon.application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;


import java.util.Date;

@Data
@Builder
@Entity
public class Coupon {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "coupon_code")
    private String coupon_code;

    @Column(name = "category")
    private String category;

    @Column(name = "validity_date")
    private Date validity_date;

    @Column(name = "discount")
    private int discount;

    @Column(name = "created_date")
    private Date created_date;

    @Column(name = "isActive")
    private boolean isActive;

    private String type;
    private String status;

}
