// Has a "Has a" relationship with Iphone. This is an
// Aggregation Relationship

abstract class HardwareComponents implements Iphone {

	protected Iphone tempIphone;
	
	// Assigns the type instance to this attribute
	// of a Iphone
	
	// All decorators can dynamically customize the Iphone
	// instance baseIphone because of this
	
	public HardwareComponents(Iphone newIphone){
		
		tempIphone = newIphone;
		
	}
	
	public String getEspecifications() {
		
		return tempIphone.getEspecifications();
		
	}

	public double getCost() {
		
		return tempIphone.getCost();
		
	}
	
}