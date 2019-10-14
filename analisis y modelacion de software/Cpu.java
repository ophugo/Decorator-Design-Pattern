public class Cpu extends HardwareComponents {

	public Cpu(Iphone newIphone) {
		super(newIphone);
		
		System.out.println("Adding a cpu");
	}
	
	// Returns the result of calling getEspecifications() for
	// BaseIphone, Graphics, Cpu and then Memory
	
	public String getEspecifications(){
		
		return tempIphone.getEspecifications() + ", cpu";
		
	}
	
	public double getCost(){
		
		System.out.println("Cost of cpu: " + 200.00);
		
		return tempIphone.getCost() + 200.00;
		
	}
	
}