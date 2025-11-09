package com.assignment.oop;

public class Barista extends Person {
    private final String shift;

    public Barista(String nama, int umur, String  shift) {
        super(nama, umur);
        this.shift = shift;
    }

    public void sambutPelanggan() {
        System.out.println("Halo, hari yang cerah! Saya " + nama + ", barista shift " + shift +
                ". Selamat datang di " + Constants.Nama_Toko + "ya, mau pesan apa hari ini?");
    }

    public void buatMinuman(String namaMinuman) {
        System.out.println("Barista " + nama + " sedang menyiapkan " +namaMinuman + ", mohon ditunggu ya!");
    }
}
