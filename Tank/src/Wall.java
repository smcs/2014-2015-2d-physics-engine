import java.awt.Image;
import java.util.Vector;

import objectdraw.DrawingCanvas;


public class Wall extends OTOS {

	
	public Wall(Image image, double x, double y, DrawingCanvas canvas, Vector<OTOS> everybody) {
		super(image, x, y, 100, 100, canvas);
		while(overlaps().size()>0){
			this.moveTo(Math.random()*1365, Math.random()*800);
		}
		
	}
		
}
