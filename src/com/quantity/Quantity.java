package com.quantity;

import java.util.Objects;

public class Quantity {
    double value;
    String unit;

    public Quantity(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert everything to base unit (inch)
    double toBaseUnit() {
        if (unit.equals("feet")) return value * 12;
        if (unit.equals("inch")) return value;
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Quantity q = (Quantity) obj;

        return Double.compare(this.toBaseUnit(), q.toBaseUnit()) == 0;
    }
}