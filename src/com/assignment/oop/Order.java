package com.assignment.oop;

public abstract class Order {
    protected  String namaPesanan;
    protected double hargaDasar;

    public Order(String namaPesanan, double hargaDasar) {
        this.namaPesanan = namaPesanan;
        this.hargaDasar = hargaDasar;
    }

    public  abstract double hitungTotal();

    public String getNamaPesanan(){
        return namaPesanan;
    }
}
