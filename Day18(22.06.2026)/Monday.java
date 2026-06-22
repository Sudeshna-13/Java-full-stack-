package com.example.Monday;

import jakarta.persistence.*;

@Entity
public class Monday {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String product;
    private Integer quantity;
    private Integer price;
    private Integer totalprice;
    public Monday(){}
    public Long getId(){ return id;}
    public String getProduct() { return product;}
    public Integer getQuantity() { return quantity;}
    public Integer getPrice() { return price;}
    public void setProduct(String product){ this.product = product;}
    public void setQuantity(Integer quantity){ this.quantity = quantity; }
    public void setPrice(Integer price){this.price = price;}
    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }
}