package com.cognizant.tax;

public class TaxCalculator {
float basicSalary;
boolean citizenship;

  // method 1
       void calculateTax(float basicSalary) {
	         this.basicSalary=basicSalary;
	         float tax=(30*(basicSalary))/100;
			System.out.println("\nThe Tax of the employee  for  the  "+basicSalary+"  is  "+ tax);
}
       
    // method 2
       void deductTax() {
    	   float nettsalary=(basicSalary)-((30*(basicSalary))/100);
    	   System.out.println("The nett salary of the employee  "+( (basicSalary)-((30*(basicSalary))/100))); 
       }
       
    // method 3
       void validateSalary() {
    	   if(basicSalary>100000) { 
    		   System.out.println("The salary and citizenship eligibility:   "+!citizenship);
    	   }  
    	   else {
    		   System.out.println("The salary and citizenship eligibility:  "+citizenship);
    	   }
       }
}
