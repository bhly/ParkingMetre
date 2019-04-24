/**
 This class represents a parking metre for the purpose of calculating parking fees based on the metre's 
 location, dollar rate per minute, and number of minutes a car has been parked. 
 @author Brynn Haley
*/

public class ParkingMetre 
{

	/**
	The street name the metre is located on.
	*/
	public String location; 
	
	
	/**
	The cost of parking at the metre (in $/minute).
	*/
	public double parkingRate = 0;
	

	/**
	The amount of time on the parking metre (minutes).
	*/
	public double time = 0;

	/**
	This method constructs a parking metre in a specified location and parking rate. 
	@param locationIn The location of the metre.
	@param parkingRateIn The cost of parking at the metre (in $/minute).
	*/
	public ParkingMetre(String location, double parkingRate)
	{
	this.location = location;
	this.parkingRate = parkingRate;
	}
	
	/**
	This method retrieves the location of the parking metre.
	@return The location of the metre.
	*/
	public String getLocation() {
		return location;
	}
	
	/**
	This method retrieves the cost of parking at the metre.
	@return The cost of parking at the metre ($/min).
	*/
	public double getParkingRate() {
		return parkingRate;
	}

	/**
	This method retrieves the amount of time left on the metre.
	@return The amount of time on the metre.
	*/
	public double getTime() {
		return time;
	}
	
	/**
	This method parks at a metre for a certain period of time.
	@param time The time parked at the metre (in minutes).
	*/
	public void park(double timeParked) {
		time -= timeParked;
		
	}
	
	/**
	This method adds money to the metre.
	@param moneyAdded Amount of money added to the metre.
	*/
	public void addMoney(double moneyAdded) {
		time = (moneyAdded / parkingRate);
	}	
	
	
} 

