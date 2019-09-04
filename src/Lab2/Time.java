/* Class: CS1302-03
 * Name: Ethan Nguyen
 * Lab: Lab2
 * Instructor: Monisha Verma
 */
package Lab2;



public class Time 
{
	//Data Fields
	private long hour;
	private long minute;
	private long second;
	
	//no-arg constructor
	public Time() 
	{
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}
	
	//constructor for time object with specified hour, minute, second
	public Time(long hour, long minute, long second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//getter for hour
	public long getHour()
	{
		return hour;
	}
	
	//getter for minute
	public long getMinute()
	{
		return minute;
	}
	
	//getter for second
	public long getSecond()
	{
		return second;
	}
	
	//constructs time object with specified elapsed time
	public Time(long elapsedTime)
	{
		setTime(elapsedTime);
		
	}
	
	//set a new time for the object using the elapsed time
	public void setTime(long elapsedTime)
	{				
						
				
					//obtain the total milliseconds since midnight, Jan 1 1970
					long totalMilliseconds = elapsedTime;
					
					//obtain the total seconds since ...
					long totalSeconds = totalMilliseconds / 1000;
							
					//compute the current second in the minute in the hour 
					this.second = totalSeconds % 60;
							
					//obtain the total minutes
					long totalMinutes = totalSeconds / 60;
							
					//compute the current minute in the hour
					this.minute = totalMinutes % 60;
							
					//obtain the total hours
					long totalHours = totalMinutes / 60;
							
					//compute the current hour
					this.hour = totalHours % 24;
				
				
				
				
	}
	
	
}
