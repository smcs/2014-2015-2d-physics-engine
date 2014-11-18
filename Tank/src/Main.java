import objectdraw.*;

import java.awt.*;
import java.awt.event.*;

public class Main extends WindowController{
	
	
	
	Tank tank1;
	Tank tank2;
	Keyboard k;
	

	
	public void begin() {
		this.setSize(1365,800);
		Image left, right, up, down;
		left = getImage("Tank Sprites/RedTankLeft.gif");
		right = getImage("Tank Sprites/RedTankRight.gif");
		up = getImage("Tank Sprites/RedTankUp.gif");
		down = getImage("Tank Sprites/RedTankDown.gif");
		tank1 = new Tank (left, right, up, down, (Math.random()*1200+70), (Math.random()*650)+75, 60, 40, canvas);
		tank2 = new Tank (left, right, up, down, (Math.random()*1200+70), (Math.random()*650)+75, 60, 40, canvas);
		k = new Keyboard(tank1, tank2);
		canvas.addKeyListener(k);
	}
	
	

	
	
}
