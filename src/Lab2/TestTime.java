/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab2
 * Instructor: Monisha Verma
 */
package Lab2;


public class TestTime 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Time currentTime = new Time();
		Time specifiedTime = new Time();
		
		currentTime.setTime(System.currentTimeMillis());
		specifiedTime.setTime(555550000);
		
		
		//print out current time
		System.out.println("The current time (in UTC) is " + currentTime.getHour() + ":" + currentTime.getMinute() + ":"
				+ currentTime.getSecond());
		
		//print out specified time
		System.out.println("\nThe time specified is " + specifiedTime.getHour() + ":" + specifiedTime.getMinute() + ":"
				+ specifiedTime.getSecond());
			
	}

}
