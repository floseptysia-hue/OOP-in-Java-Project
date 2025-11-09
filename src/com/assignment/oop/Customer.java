package com.assignment.oop;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private List<Order> daftarPesanan = new ArrayList<>();

    public Customer(String nama, int umur) {
        super(nama, umur);
    }

    public void tambahPesanan(Order order) {
        daftarPesanan.add(order);
    }

    public void tampilkanPesanan() {
        System.out.println("\nPesanan milik " + nama + ":");
        for (Order o : daftarPesanan) {
            System.out.println("- " + o.getNamaPesanan() + " (Rp" + o.hitungTotal() + ")");
        }
    }

    public double hitungTotalPesanan() {
        double total = 0;
        for (Order o : daftarPesanan) {
            total += o.hitungTotal();
        }
        return total;
    }
}
