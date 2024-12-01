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
                PembayaranBelanja ewallet = new PembayaranBelanja();
                System.out.println("Masukkan PIN E-Wallet anda");
                ewallet.pin =input.nextInt();
                System.out.println("Nominal Pembayaran");
                ewallet.BayarEwallet = input.nextInt();
                System.out.println("""
                                                   Pembayaran E-Wallet Berhasil
                                                   Total Transaksi
                                                   Rp"""+ewallet.BayarEwallet);
            }
            case 2 -> {
                PembayaranBelanja credit = new PembayaranBelanja();
                System.out.println("Masukkan Credit PIN anda");
                credit.pin=input.nextInt();
                System.out.println("Nominal Pembayaran");
                credit.BayarCreditCard= input.nextInt();
                System.out.println("""
                                                   Pembayaran Melalui Credit Card Berhasil
                                                   Total Transaksi
                                                   Rp"""+credit.BayarCreditCard);
            }
            case 3 -> {
                PembayaranBelanja debit = new PembayaranBelanja();
                System.out.println("Masukkan PIN QRIS anda");
                debit.pin=input.nextInt();
                System.out.println("Nominal Pembayaran");
                debit.BayarQRIS= input.nextInt();
                System.out.println("""
                                                   Pembayaran melalui QRIS Berhasil
                                                   Total Transaksi
                                                   Rp"""+debit.BayarQRIS);
            }
            case 4 -> {
                PembayaranBelanja shopee = new PembayaranBelanja();
                System.out.println("Masukkan PIN Shopee anda");
                shopee.pin=input.nextInt();
                System.out.println("Nominal Pembayaran");
                shopee.BayarShopee= input.nextInt();
                System.out.println("""
                                                   Pembayaran melalui Shopee Berhasil
                                                   Total Transaksi
                                                   Rp"""+shopee.BayarShopee);
            }
            case 5 -> {
                PembayaranBelanja gopay = new PembayaranBelanja();
                System.out.println("Masukkan PIN anda");
                gopay.pin=input.nextInt();
                System.out.println("Nominal Pembayaran");
                gopay.BayarGopay= input.nextInt();
                System.out.println("""
                                                   Pembayaran melalui Shopee Berhasil
                                                   Total Transaksi
                                                   Rp"""+gopay.BayarGopay);
            }
            case 6 -> {
                PembayaranBelanja cash = new PembayaranBelanja();
                System.out.println("Nominal Pembayaran");
                cash.BayarCash = input.nextInt();
                System.out.println("Kembalian" + cash.kembalian);
            }
            default -> {
            }
        }
    }
}

