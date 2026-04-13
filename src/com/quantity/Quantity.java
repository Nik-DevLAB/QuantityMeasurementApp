package com.quantity;

import java.util.Objects;

public class Quantity {
    double value;
    LengthUnit unit;

    public Quantity(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        this.value = value;
        this.unit = unit;
    }

    double toBaseUnit() {
        return unit.toBase(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Quantity q = (Quantity) obj;

        return Double.compare(this.toBaseUnit(), q.toBaseUnit()) == 0;
    }
}