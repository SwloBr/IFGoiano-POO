package com.swlo.vehicle;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
public class Car {

    private final String brand;
    private final String mdoel;
    private final String plate;
    private final String year;
    private boolean available;
    private double value;

    public Car(String brand, String mdoel, String plate, String year, double value) {
        this.brand = brand;
        this.mdoel = mdoel;
        this.plate = plate;
        this.year = year;
        this.value = value;
        available = true;
    }

    public int maxRenovation() {
        return 0;
    }


    public double penaltyValue() {
        return (value*0.45);
    }

    public String getBrand() {
        return brand;
    }

    public String getMdoel() {
        return mdoel;
    }

    public String getPlate() {
        return plate;
    }

    public String getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}


