// Implements the Iphone interface with only the required
// methods from the interface

// Every Iphone made will start as a BaseIphone

public class BaseIphone implements Iphone {
 
	public String getEspecifications() {
		
		return "Iphone skeleton";
	
	}

	public double getCost() {

		System.out.println("Cost of Iphone skeleton: " + 200.00);
		
		return 200.00;
	
	}
 
}
