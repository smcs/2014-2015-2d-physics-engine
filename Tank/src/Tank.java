import java.awt.*;

import objectdraw.*;

public class Tank extends OTOS{

	private double health = 10;
	private double heat = 0;
	private VisibleImage sprite;
	
	public Tank(Image image, double x, double y, int w, int h, DrawingCanvas canvas) {
		super(image, x, y, w, h, canvas);
	}
	
	void lowerHealth(double h){
		health = health - h;
	}
	
	
	
}
