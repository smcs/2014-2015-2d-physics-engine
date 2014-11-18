import objectdraw.*;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main extends WindowController{
	
	
	
	private Tank tank1;
	private Tank tank2;
	private Keyboard k;
	private Vector<OTOS> everybody;

	
	public void begin() {
		this.setSize(1365,800);
		Image left, right, up, down;
		left = getImage("Tank Sprites/RedTankLeft.gif");
		right = getImage("Tank Sprites/RedTankRight.gif");
		up = getImage("Tank Sprites/RedTankUp.gif");
		down = getImage("Tank Sprites/RedTankDown.gif");
		everybody = new Vector<OTOS>();
		tank1 = new Tank (left, right, up, down, (Math.random()*1200+70), (Math.random()*650)+75, 60, 40, canvas, everybody);
		everybody.add(tank1);
		tank2 = new Tank (left, right, up, down, (Math.random()*1200+70), (Math.random()*650)+75, 60, 40, canvas, everybody);
		everybody.add(tank2);
		k = new Keyboard(tank1, tank2);
		canvas.addKeyListener(k);
	}
	
	

	
	
}