package com.tw.apistackbase.modules;

import javax.persistence.*;


@Entity
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;


    private  String name;
    private  int capicity;
    private  String location;

    public ParkingLot() {

    }

    public ParkingLot(String name, int capicity, String location) {
        this.name = name;
        this.capicity = capicity;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapicity() {
        return capicity;
    }

    public void setCapicity(int capicity) {
        this.capicity = capicity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
