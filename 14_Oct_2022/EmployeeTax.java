package com.cognizant.tax;

public class EmployeeTax {

	public static void main(String[] args) {
		
		TaxCalculator t= new TaxCalculator();
		System.out.println("Test Case 1");
		t.calculateTax(25000.00f);
		t.deductTax();
		t.validateSalary();
		System.out.println("\n\nTest Case 2");
		t.calculateTax(125000.00f);
		t.deductTax();
		t.validateSalary();
	}
}
