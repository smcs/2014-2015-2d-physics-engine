import java.awt.*;

import objectdraw.*;

public class OTOS {

	protected VisibleImage sprite;
	

	
	public OTOS(Image image, double x, double y, double width, double height, DrawingCanvas canvas){
		sprite = new VisibleImage(image, x, y, width, height, canvas);
	}

	void moveTo(double x, double y){
		sprite.moveTo(x,y);
	}
	
	void moveTo(Location l){
		sprite.moveTo(l);
	}
	
	void setImage(java.awt.Image image){
		sprite.setImage(image);
	}
	
	boolean contains(Location point){
		return sprite.contains(point);
	}
	
	double getX(){
		return sprite.getX();
	}
	
	double getY(){
		return sprite.getY();
	}
	
	

}
