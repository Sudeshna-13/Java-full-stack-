package com.example.hotelBookTuesday;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String room_no;
    private String date;
    private String mobile_no;
    public Hotel(){}
    public Long getId(){ return id;}
    public String getName(){ return name;}
    public String getMobile_no(){ return mobile_no;}
    public String getRoom_no(){ return room_no;}
    public String getDate(){ return date;}

    public void setName(String name){this.name=name;}
    public void setMobile(String mobile_no){this.mobile_no=mobile_no;}
    public void setRoomNo(String room_no){this.room_no=room_no;}
    public void setDate(String date){this.date=date;}




}
