/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab2
 * Instructor: Monisha Verma
 */
package Lab2;

public class TestMyInteger 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//create test objects
		MyInteger value = new MyInteger(10);
		MyInteger value2 = new MyInteger(11);
		String str = "115";
		char[] numbers = {'5', '1', '1'};
		
		//prints out confirmations
		System.out.println("Is the value 10 even?: " + value.isEven());
		System.out.println("Is the value 10 odd?: " + value.isOdd());
		System.out.println("Is the value 10 a prime number?: " + value.isPrime());
		
		System.out.println("\nIs the value 11 even?: " + value2.isEven());
		System.out.println("Is the value 11 odd?: " + value2.isOdd());
		System.out.println("Is the value 11 a prime number?: " + value2.isPrime());
		
		System.out.println("\nConverts array {'5', '1', '1'} to int: " + MyInteger.parseInt(numbers));
		System.out.println("Converts string str (115) to int: " + MyInteger.parseInt(str));
	}

}
