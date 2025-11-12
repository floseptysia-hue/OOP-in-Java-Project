package com.assignment.oop;

public class Main {
    public static void main(String[] args) {

        Barista adi = new Barista("Adi", 28, Constants.SHIFT_PAGI);
        Customer flo = new Customer ("Flo", 24);

        
        adi.sambutPelanggan();
        DrinkOrder boba = new DrinkOrder("Boba Latte", 20000, true);
        SnackOrder cake = new SnackOrder("Cheese Cake", 50000,true);
        
        flo.tambahPesanan(boba);
        flo.tambahPesanan(cake);

        adi.buatMinuman(boba.getNamaPesanan());
        adi.buatMinuman(cake.getNamaPesanan());
        
        flo.tampilkanPesanan();


        double subtotal = flo.hitungTotalPesanan();
        double total = subtotal + (subtotal * Constants.PAJAK);

        System.out.println("\nSubtotal: Rp" + subtotal);
        System.out.println("Pajak (10%) : Rp" + (subtotal * Constants.PAJAK));
        System.out.println("Total yang harus dibayar sebesar: Rp" + total);

        System.out.println("\nTerimakasih sudah berkunjung ke " + Constants.Nama_Toko + ". Datang lagi dilain waktu ya, see you!");

    }
}
