import objectdraw.*;
import static java.lang.System.out;

public class RandomBox extends WindowController {
	
	public double height = Math.random() * 100 + 20;
	public double width = Math.random() * 100 + 20;
	public Location startPoint = new Location(100-height/2,100-width/2);
	
	public void begin() {
		new FilledRect(startPoint, height, width, canvas);
	}
	public void onMousePress(Location pressPoint){
		System.out.println("Location:" + startPoint );
		System.out.println("Height:" + height );
		System.out.println("Width:" + width );
	}

}
