package com.swlo.vehicle;

public class Delux extends Car {

    private final String trunkSize;
    private int airbagQuantity;
    private boolean gps;

    public Delux(String brand, String mdoel, String plate, String year, double value, String trunkSize, int airbagQuantity, boolean gps) {
        super(brand, mdoel, plate, year, value);
        this.trunkSize = trunkSize;
        this.airbagQuantity = airbagQuantity;
        this.gps = gps;
    }

    @Override
    public int maxRenovation() {
        return 5;
    }




}
