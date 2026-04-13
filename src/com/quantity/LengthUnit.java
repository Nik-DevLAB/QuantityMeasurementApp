package com.quantity;

public enum LengthUnit {
    FEET(12.0),
    INCH(1.0);

    private final double conversionFactor;

    LengthUnit(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double toBase(double value) {
        return value * conversionFactor;
    }
}