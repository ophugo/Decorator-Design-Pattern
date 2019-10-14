public class IphoneMachine {
	
	public static void main(String[] args){
		
		// The Base Iphone object is sent to the cpu constructor
		// and then to the Graphics and Memory constructor
		
		Iphone basicIphone = new Cpu(new Graphics(new Memory (new BaseIphone())));
		
		System.out.println("Components: " + basicIphone.getEspecifications());
		
		System.out.println("Price: " + basicIphone.getCost());
		
	}
	
}