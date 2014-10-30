import objectdraw.*;
public class Railroad extends WindowController {

	private int counter = 0;
	
	public void begin(){
		new Line(100, 20, 160, 180, canvas);
		new Line(100, 20, 40, 180, canvas);
		
		while(counter<10){
			new FilledRect(100-10*counter,20*counter,20*counter,10,canvas);
			counter = counter + 1;
		}
		
	}
	
	
	
}
