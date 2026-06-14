package com.example.cafe;
public class Cafe {
    private int id;
    private String customerName;
    private String cafeType;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCafeType() {
        return cafeType;
    }
    public void setCafeType(String cafeType) {
        this.cafeType = cafeType;
    }
}