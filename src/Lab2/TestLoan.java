/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab2
 * Instructor: Monisha Verma
 */
package Lab2;

import java.util.Scanner;

@SuppressWarnings("unused")
public class TestLoan {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/*
		 * 
		 *  // Create a Scanner
	    @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

	    // Enter yearly interest rate
	    System.out.print(
	      "Enter yearly interest rate, for example, 8.25: ");
	    double annualInterestRate = input.nextDouble();

	    // Enter number of years
	    System.out.print("Enter number of years as an integer: ");
	    int numberOfYears = input.nextInt();

	    // Enter loan amount
	    System.out.print("Enter loan amount, for example, 120000.95: ");
	    double loanAmount =  input.nextDouble();
		 		
	    // Create Loan object
	    Loan loan =
	      new Loan(annualInterestRate, numberOfYears, loanAmount);

		*/

		//Create carLoan Object
		Loan carLoan =
			      new Loan(8.50, 5, 15000);
		
	    // Display loan date, monthly payment, and total payment
	    System.out.printf("The Car loan was created on %s\n" +
	      "The monthly payment is $%.2f\nThe total payment is $%.2f\n",
	      carLoan.getLoanDate().toString(), carLoan.getMonthlyPayment(), 
	      carLoan.getTotalPayment());
	  }
	

}
