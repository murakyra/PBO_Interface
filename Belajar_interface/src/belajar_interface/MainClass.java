package belajar_interface;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Metode;
        
        System.out.println("Pilih Metode Pembayaran");
        System.out.println("1. E-Wallet");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        System.out.println("4. ShopeePay");
        System.out.println("5. Gopay");
        System.out.println("6. Cash");
        Metode = input.nextInt();
        
        switch (Metode) {
            case 1 -> {
                PembayaranBelanja pbe = new PembayaranBelanja();
                System.out.println("Masukkan PIN E-Wallet anda");
                pbe.pin =input.nextInt();
                System.out.println("Nominal Pembayaran");
                pbe.BayarEwallet = input.nextInt();
                System.out.println("""
                                                   Pembayaran E-Wallet Berhasil
                                                   Total Transaksi
                                                   Rp"""+pbe.BayarEwallet);
            }
            case 2 -> {
                PembayaranBelanja pbc = new PembayaranBelanja();
                System.out.println("Masukkan Credit PIN anda");
                pbc.pin=input.nextInt();
                System.out.println("Nominal Pembayaran");
                pbc.BayarCreditCard= input.nextInt();
                System.out.println("""
                                                   Pembayaran Melalui Credit Card Berhasil
                                                   Total Transaksi
                                                   Rp"""+pbc.BayarCreditCard);
            }
            case 3 -> {
                PembayaranBelanja pbq = new PembayaranBelanja();
                System.out.println("Masukkan PIN QRIS anda");
                pbq.pin=input.nextInt();
                System.out.println("Nominal Pembayaran");
                pbq.BayarQRIS= input.nextInt();
                System.out.println("""
                                                   Pembayaran melalui QRIS Berhasil
                                                   Total Transaksi
                                                   Rp"""+pbq.BayarQRIS);
            }
            case 4 -> {
                PembayaranBelanja pbs = new PembayaranBelanja();
                System.out.println("Masukkan PIN Shopee anda");
                pbs.pin=input.nextInt();
                System.out.println("Nominal Pembayaran");
                pbs.BayarShopee= input.nextInt();
                System.out.println("""
                                                   Pembayaran melalui Shopee Berhasil
                                                   Total Transaksi
                                                   Rp"""+pbs.BayarShopee);
            }
            case 5 -> {
                PembayaranBelanja pbg = new PembayaranBelanja();
                System.out.println("Masukkan PIN anda");
                pbg.pin=input.nextInt();
                System.out.println("Nominal Pembayaran");
                pbg.BayarGopay= input.nextInt();
                System.out.println("""
                                                   Pembayaran melalui Shopee Berhasil
                                                   Total Transaksi
                                                   Rp"""+pbg.BayarGopay);
            }
            case 6 -> {
                PembayaranBelanja pbcs = new PembayaranBelanja();
                System.out.println("Nominal Pembayaran");
                pbcs.BayarCash = input.nextInt();
                System.out.println("Kembalian" + pbcs.kembalian);
            }
            default -> {
            }
        }
    }
}

