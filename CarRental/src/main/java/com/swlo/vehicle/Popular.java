package com.swlo.vehicle;

public class Popular extends Car {
    private final boolean airConditioner;

    public Popular(String brand, String mdoel, String plate, String year, double value, boolean airConditioner) {
        super(brand, mdoel, plate, year, value);
        this.airConditioner = airConditioner;
    }

    @Override
    public int maxRenovation() {
        return 1;
    }

    @Override
    public double penaltyValue() {
        return 200;
    }
}
