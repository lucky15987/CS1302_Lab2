/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab2
 * Instructor: Monisha Verma
 */
package Lab2;

public class MyPoint 
{
	//data fields
	double x;
	double y;
	
	//no-arg constructor
	public MyPoint()
	{
		this(0, 0);
	}
	
	//constructor for MyPoint
	public MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	//getter for x
	public double getX()
	{
		return x;
	}
	
	//getter for y
	public double getY()
	{
		return y;
	}
	
	//constructor for specified points
	//public void point(double x, double y)
	//{
		//this.x = x;
		//this.y = y;		
	//}
	
	//method distance with myPoint object
	public double distance(MyPoint myPoint )
	{
		return Math.sqrt(Math.pow(myPoint.getX() - x, 2) + (Math.pow(myPoint.getY() - y, 2)));
	}
	
	//overloaded method distance given two points
	public double distance(double x, double y)
	{
		return distance(new MyPoint(x, y));
	}
}
