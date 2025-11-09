package com.assignment.oop;

public class SnackOrder extends Order {
    private boolean dihangatkan;

    public SnackOrder(String namaPesanan, double hargaDasar, boolean dihangatkan) {
        super(namaPesanan, hargaDasar);
        this.dihangatkan = dihangatkan;
    }

    @Override
    public double hitungTotal() {
        double tambahan = dihangatkan ? Constants.BIAYA_MENGHANGATKAN_MAKANAN : 0;
        return hargaDasar + tambahan;
    }

    public boolean isDihangatkan() {
        return dihangatkan;
    }
}
