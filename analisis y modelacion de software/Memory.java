

public class Memory extends HardwareComponents {

	public Memory(Iphone newIphone) {
		
		super(newIphone);
		
		
		System.out.println("Adding SSD ");
	}
	
	// Returns the result of calling getEspecifications() for
	// Base Iphone and adds " Memory" to it
	
	public String getEspecifications(){
		
		return tempIphone.getEspecifications() + ", SSD 512gb";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of SSD(512gb): " + 100.00);
		
		return tempIphone.getCost() + 100.00;
		
	}
	
}