package com.swlo.vehicle;

public class Suv extends Car{

    private final String trunkSize;
    private final String traction;
    private final String fuelType;

    public Suv(String brand, String mdoel, String plate, String year, double value, String trunkSize, String traction, String fuelType) {
        super(brand, mdoel, plate, year, value);
        this.trunkSize = trunkSize;
        this.traction = traction;
        this.fuelType = fuelType;
    }

    @Override
    public int maxRenovation() {
        return 3;
    }

}
