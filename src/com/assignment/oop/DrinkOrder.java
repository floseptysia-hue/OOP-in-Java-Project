package com.assignment.oop;

public class DrinkOrder extends Order {
    private boolean pakaiEs;

    public DrinkOrder(String namaPesanan, double hargaDasar, boolean pakaiEs) {
        super(namaPesanan, hargaDasar);
        this.pakaiEs = pakaiEs;
    }

    @Override
    public double hitungTotal() {
        double tambahan = pakaiEs ? Constants.BIAYA_TAMBAHAN_ES : 0;
        return hargaDasar + tambahan;
    }

    public boolean isPakaiEs() {
        return pakaiEs;
    }
}
