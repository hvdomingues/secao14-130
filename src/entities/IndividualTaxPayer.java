package entities;

public class IndividualTaxPayer extends TaxPayer{

	
	private Double healthExpenditures;
	
	public IndividualTaxPayer() {
	}
	
	public IndividualTaxPayer(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	
	@Override
	public Double taxesPaid() {
		
		if(anualIncome < 20000.00) {
			taxesPaid = anualIncome * 0.15;
		}else {
			taxesPaid = anualIncome * 0.25;
		}if(healthExpenditures > 0) {
			taxesPaid -= healthExpenditures / 2;
		}
		
		return taxesPaid;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
}
