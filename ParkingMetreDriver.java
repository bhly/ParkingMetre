public class ParkingMetreDriver { 

	public static void main(String args[]){ 
		
		ParkingMetre sunset = new ParkingMetre("Sunset Avenue", 0.05);
		ParkingMetre belmont = new ParkingMetre("Belmont Crescent", 0.03);
		
		sunset.addMoney(3.00);
		belmont.addMoney(4.00);
		sunset.park(43);
		belmont.park(115);
		
		System.out.println("Time left on Sunset Ave. metre: " + 
			sunset.getTime());
		System.out.println("Time left on Belmont Cr. metre: " + 
			belmont.getTime()); 
			
		sunset.addMoney(0.1);
		sunset.park(100);
		
		System.out.println("Time left on Sunset Ave. metre: " + 
			sunset.getTime());
	} 
} 
		
		
		