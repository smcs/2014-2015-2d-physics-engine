import java.awt.*;
import java.util.Vector;

import objectdraw.*;


public class Main extends WindowController {

	
	//private Image red = getImage("Images/Red.png");
	//private Image blue = getImage("Images/Blue.png");
	
	
	private InteractiveObject redSprite;
	private InteractiveObject greenSprite;
	private InteractiveObject blueSprite;
	
	
public void begin(){
	Image red, blue, green;
	red = getImage("Images/Red.png");
	blue = getImage("Images/Blue.png");
	green = getImage("Images/Green.png");
	//this.setSize(1365,800); fullscreen
	this.setSize(600,500); 
	redSprite = new InteractiveObject(red, 100, 100, 50, 50, canvas);
	greenSprite = new InteractiveObject(green, 400, 400, 50, 50, canvas);
	blueSprite = new InteractiveObject(blue, 200, 200, 50, 50, canvas);
	
	}
	
	
	public void onMousePress(Location l){
		blueSprite.moveTo(l);
		
		if(blueSprite.overlaps().size()>0){
			System.out.print("hit: ");
		}
		
		if(blueSprite.overlaps().contains(redSprite)){
			System.out.println("red");
		}
		
		if(blueSprite.overlaps().contains(greenSprite)){
			System.out.println("green");
		}
		
	}
	
}
