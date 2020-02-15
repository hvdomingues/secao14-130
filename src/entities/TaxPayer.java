package entities;

public abstract class TaxPayer {

	protected String name;
	protected Double anualIncome;
	protected Double taxesPaid;
	
	public abstract Double taxesPaid();

	public TaxPayer() {
	}
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public Double getTaxesPaid() {
		return taxesPaid;
	}

	public void setTaxesPaid(Double taxesPaid) {
		this.taxesPaid = taxesPaid;
	}
	
	
}
