package entities;

public abstract class TaxPayer {

	private String name;
	private Double anualIncome;

	public TaxPayer(String name, Double anualIncome) {
		super();
		this.name        = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract double tax();
	
}
