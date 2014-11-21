import objectdraw.*;

import java.awt.*;
import java.util.*;

public class test extends WindowController{
	
	
	
	private OTOS one;
	private OTOS two;
	private Vector<OTOS> everybody;

	
	public void begin() {
		this.setSize(1365,800);
		Image i;
		i = getImage("Tank Sprites/RedTankLeft.gif");
		everybody = new Vector<OTOS>();
		one = new OTOS(i, 50, 50, 40, 60, canvas);
		two = new OTOS(i, 80, 50, 40, 60, canvas);
	}
	
	public void onMouseMove(Location l){
		one.moveTo(l);
		if(one.overlaps(everybody).size() != 0){
			new Text("two", 50, 60, canvas);
		}
		
	}
	

	
	
}
