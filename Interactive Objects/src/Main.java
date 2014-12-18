import java.awt.*;
import java.util.Vector;

import objectdraw.*;


public class Main extends WindowController {

	
	//private Image red = getImage("Images/Red.png");
	//private Image blue = getImage("Images/Blue.png");
	
	
	private InteractiveObject redSprite;
	private InteractiveObject blueSprite;
	
	
public void begin(){
	Image red, blue;
	red = getImage("Images/Red.png");
	blue = getImage("Images/Blue.png");
	this.setSize(1365,800);
	redSprite = new InteractiveObject(red, 100, 100, 50, 50, canvas);
	blueSprite = new InteractiveObject(blue, 200, 200, 50, 50, canvas);
	
	}
	
	
	public void onMousePress(Location l){
		blueSprite.moveTo(l);
		if(blueSprite.overlaps().size()>0){
			System.out.println("hit");
		}
		
	}
	
}
