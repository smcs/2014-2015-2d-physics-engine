import java.awt.*;
import java.util.*;
import objectdraw.*;


public class Bullet extends OTOS implements Runnable {

	private Vector<OTOS> everybody;
	
	Bullet( Image image, int x, int y, int heading, DrawingCanvas canvas, Vector<OTOS> everybody){
		super (image, x, y, 5, 5 canvas);
		this.everybody = everybody;
		new Thread(this).start();
	}
	
	public void run() {
		while//not touching another otos (loop through everybody and see if I'm hitting them)
			move in heading
	}
}
