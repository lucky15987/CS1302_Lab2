/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab2
 * Instructor: Monisha Verma
 */
package Lab2;

public class TestMyPoint 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//create point objects
		MyPoint point1 = new MyPoint(2,4);
		MyPoint point2 = new MyPoint(4,8);
		
		//print using distance to origin.
		System.out.println("The Distance from point 1 to point 2 is: " + point1.distance(point2));
		System.out.println("The Distance from point 1 to a specified point (4,6) is: " + point1.distance(4,6));
	}

}
