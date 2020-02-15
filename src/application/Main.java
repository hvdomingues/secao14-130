package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyTaxPayer;
import entities.IndividualTaxPayer;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> taxPayer = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();
		
		for(int i = 0; i < taxPayers; i++) {
			System.out.print("Individual or company? (i/c)");
			char type = sc.next().charAt(0);
			
			if(type == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();

				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				taxPayer.add(new IndividualTaxPayer(name, anualIncome, healthExpenditures));
				
				
				
				
			}else if(type == 'c') {
				
				System.out.print("Name: ");
				String name = sc.next();
				
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();

				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				
				taxPayer.add(new CompanyTaxPayer(name, anualIncome, numberOfEmployees));
				
			}else {
				System.out.println("Você digitou errado, o programa será encerrado");
				System.exit(0);
			}
			
		}
		
		System.out.println("TAXES PAID:");
		Double totalTaxes = 0.00;
		for( TaxPayer c : taxPayer) {
			System.out.printf(c.getName() + ": $ %.2f%n", c.taxesPaid());
			totalTaxes += c.getTaxesPaid();
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", totalTaxes);
		
		sc.close();
		

	}

}
