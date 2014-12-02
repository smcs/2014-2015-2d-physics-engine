import java.awt.Image;
import java.awt.Toolkit;
import java.util.*;

import objectdraw.*;


public class Bullet extends OTOS implements Runnable {

	private Vector<OTOS> everybody;
	private char heading;

	
	Bullet(Image i, int x, int y, char h, DrawingCanvas canvas, Vector<OTOS> everybody){
		super (i, x, y, 5, 5, canvas);
		this.everybody = everybody;
		new Thread(this).start();
		heading = h;
	}
	Bullet(Image i, double x, double y, char h, DrawingCanvas canvas, Vector<OTOS> everybody){
		super (i, x, y, 5, 5, canvas);
		this.everybody = everybody;
		new Thread(this).start();
		heading = h;
	}
	
	

	
	
	OTOS hitObject;
	
	public void run() {
		while(overlaps(everybody).size() != 0){
			if(heading == 'w'){
				this.moveTo(this.getX(), this.getY()-2);
			}
			if(heading == 'a'){
				this.moveTo(this.getX()-2, this.getY());
			}
			if(heading == 's'){
				this.moveTo(this.getX(), this.getY()+2);
			}
			if(heading == 'a'){
				this.moveTo(this.getX()+2, this.getY());
			}
		}
		
		hitObject = overlaps(everybody).elementAt(1);
		
	}
}
