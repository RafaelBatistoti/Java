package model.service;

public class BrazilianTaxService {

	public double tax(double amount) {
		return amount <= 100.00 ? amount * 0.2 : amount * 0.15;
	}

}
