package entities;

public class CompanyTaxPayer extends TaxPayer{

	
	private Integer numberOfEmployees;
	
	public CompanyTaxPayer() {
	}
	
	public CompanyTaxPayer(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name,anualIncome);
		this.setNumberOfEmployees(numberOfEmployees);
	}
	
	
	
	
	
	
	
	@Override
	public Double taxesPaid() {
		
		if(numberOfEmployees > 10) {
			taxesPaid = anualIncome * 0.14;
		}else {
			taxesPaid = anualIncome * 0.16;
		}
		
		return taxesPaid;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
}
