import objectdraw.*;
import static java.lang.System.out;

public class RandomBox extends WindowController {
	private int boxExists = 1;
	private double height = Math.random() * 100 + 20;
	private double width = Math.random() * 100 + 20;
	private Location startPoint = new Location(100-height/2,100-width/2);
	
	private FilledRect box;
	
	public void begin() {
		box = new FilledRect(startPoint, height, width, canvas);
	}
	
	
	public void onMousePress(Location pressPoint){
		System.out.println("Location:" + startPoint );
		System.out.println("Height:" + height );
		System.out.println("Width:" + width );
	}
	
	
	public void onMouseMove(){
		if(boxExists == 0){
			box = new FilledRect(startPoint, height, width, canvas);
		}
		}
	
	public void onMouseExit(){
		System.out.println("onMouseExit works");
		//box.removeFromCanvas();//
		boxExists = 0;
	}
		
		
		
		
		
		
	}


