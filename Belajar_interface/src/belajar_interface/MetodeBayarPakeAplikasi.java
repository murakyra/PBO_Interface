package belajar_interface;

public interface MetodeBayarPakeAplikasi extends MetodeBayar{
	public double bayarGoPay (int idUser, double saldo, double belanjaTotal);
	public double bayarShopeePay (int idUser, double saldo, double belanjaTotal);
}
