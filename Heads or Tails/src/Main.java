import objectdraw.*;
public class Main extends WindowController{

	int heads = 0;
	int tails = 0;
	
		
	public void begin(){
		for(int counter = 0; counter < 10000; counter++){
		

		
			if(Math.random()>.5){
				heads++;
			}
		
		
			if(Math.random()<.5){
				tails++;
			}
			
			
		}
		
		System.out.println("heads="+heads);
		System.out.println("tails="+tails);
		
		
		
	}
	
	
}
		

