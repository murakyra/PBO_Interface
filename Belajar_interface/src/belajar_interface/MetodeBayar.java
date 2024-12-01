package belajar_interface;

public interface MetodeBayar {
    public double BayarCash (double cash, double belanja);
    public double BayarQRIS(int pin,double saldo, double harga);
    public double BayarCreditCard(int pin, double saldo, double harga);
    public double BayarDebitCard(int pin, double saldo, double harga);
    public double BayarEwallet(int pin, double saldo, double harga);
    public double BayarGopay(int pin, double saldo, double harga);
    public double BayarShopee(int pin, double saldo, double harga);
}
