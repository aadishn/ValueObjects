package com.aadishn;

public class Rupee {
    private final int amount;

    public Rupee(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Rupee))
            return false;
        Rupee rupee = (Rupee) obj;
        return this.amount== rupee.amount;
    }
}
