import java.awt.*;

import objectdraw.*;


public class Bullet extends OTOS implements Runnable {

	Bullet( Image image, int x, int y, int heading, DrawingCanvas canvas){
		super (image, x, y, 5, 5 canvas);
		
		new Thread(this).start();
	}
	
	public void run() {
		while//not touching another otos
			move in heading
	}
}
