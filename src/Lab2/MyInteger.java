/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab2
 * Instructor: Monisha Verma
 */
package Lab2;

public class MyInteger 
{
	//private data fields
	public int value;
	
	//constructor for int value
	public MyInteger(int value)
	{
		this.value = value;
	}
	
	//getter for int value
	public int getValue()
	{
		return value;
	}
	
	//boolean for isEven()
	public boolean isEven()
	{
		return isEven(value);
	}
	
	//boolean for isOdd()
	public boolean isOdd()
	{
		return isOdd(value);
	}
	
	//boolean for isPrime()
	public boolean isPrime()
	{
		return isPrime(value);
	}
	
	//-----------------------------------------------------------
	
	//boolean for isEven(value)
	public static boolean isEven(int value)
	{
		return value % 2 == 0;
	}
		
	//boolean for isOdd(value)
	public boolean isOdd(int value)
	{
		return value % 2 != 0;
	}
		
	//boolean for isPrime(value)
	public boolean isPrime(int value)
	{
		for (int divisor = 2; divisor <= (value / 2); divisor++ )
		{
			if (value % divisor == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	//----------------------------------------------------------------
			
	//static boolean for isEven(MyInteger)
	public static boolean isEven(MyInteger myInteger)
	{
		return myInteger.isEven();
	}
	
	//static boolean for isOdd(MyInteger)
	public static boolean isOdd(MyInteger myInteger)
	{
		return myInteger.isOdd();
	}
	
	//static boolean for isPrime(MyInteger)
	public static boolean isPrime(MyInteger myInteger)
	{
		return myInteger.isPrime();
	}
	
	//----------------------------------------------------------------
	
	//boolean method equal(int) that returns true if the value is equal to a specific value
	public boolean equals(int value)
	{
		return this.value == value;
	}
	
	//boolean method equal(myInteger)
	public boolean equals(MyInteger myInteger)
	{
		return myInteger.value == this.value;
	}
	
	//------------------------------------------------------------------
	
	//static method converts an array of numeric characters to an "int" value
	public static int parseInt(char[] chars)
	{
		int value = 0;
		for (char i: chars)
		{
			value += Character.getNumericValue(i);
		}
		/*for (int i = 0, j = (int) Math.pow(10, chars.length - 1); i < chars.length; i++, j /= 10)
		//{
			value += (chars[i] - 48) * j;
		}*/
		return value;
	}
	
	//static method converts a string into int values
	public static int parseInt(String str)
	{
		/*int value = 0;
		for (int i = 0, j = (int) Math.pow(10, str.length() - 1); i < str.length(); i++, j /= 10)
		{
			value += (str.charAt(i) - 48) * j;
		} */
		
		 int value = Integer.parseInt(new String(str));
		 return value;
	}
	
}
