package com.bechalor.sealthedeal.model;

import javax.persistence.*;
import java.util.Date;

import com.bechalor.sealthedeal.model.AdminModel.Admins;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Ads
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double price;
    private String company_name;
    private Date date;
    private String description;
    private String product_name;

    @ManyToOne
    @JsonIgnore
    private Vendor vendor;
    @ManyToOne
    @JsonIgnore
    private Admins admin;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Admins getAdmin() {
        return admin;
    }

    public void setAdmin(Admins admin) {
        this.admin = admin;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

}
