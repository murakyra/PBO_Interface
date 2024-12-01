/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar_interface;

/**
 *
 * @author LENOVO
 */
public class PembayaranBelanja implements MetodeBayar{
    double cash;
    double kembalian;
    double belanja;
    double saldo;
    int pin;
    int BayarEwallet;
    int BayarCreditCard;
    int BayarQRIS;
    int BayarShopee;
    int BayarGopay;
    int BayarCash;
    
    @Override
    public double BayarCash(double cash, double belanja){
        kembalian = cash - belanja;
        return kembalian;
    }
    @Override
    public double BayarQRIS(int pin, double saldo, double belanja){
        kembalian = saldo - belanja;
        return kembalian;
    }
    
    @Override
    public double BayarEwallet(int pin, double saldo, double belanja){
        kembalian = saldo - belanja;
        return kembalian;
    }
    @Override
    public double BayarCreditCard(int pin, double saldo, double belanja){
        kembalian = saldo - belanja;
        return kembalian;
    }
    @Override
    public double BayarDebitCard(int pin, double saldo, double belanja){
        kembalian = saldo - belanja;
        return kembalian;
    }  


    @Override
    public double BayarGopay(int pin, double saldo, double harga) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double BayarShopee(int pin, double saldo, double harga) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
