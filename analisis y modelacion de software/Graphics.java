public class Graphics extends HardwareComponents {

	public Graphics(Iphone newIphone) {
		
		super(newIphone);
		
		System.out.println("Adding iphone skeleton");
		
		System.out.println("Adding base cpu");
	}
	
	// Returns the result of calling getEspecifications() for
	// BaseIphone and adds " Graphics" to it
	
	public String getEspecifications(){
		
		return tempIphone.getEspecifications() + ", base Gpu";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of base gpu: " + 150.00);
		
		return tempIphone.getCost() + 150.00;

		
	}
	
}