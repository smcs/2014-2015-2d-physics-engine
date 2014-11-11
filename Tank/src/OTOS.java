import java.awt.*;

import objectdraw.*;

public class OTOS {

	VisibleImage sprite;
	
	
	void init(java.awt.Image image, double x, double y, double width, double height, DrawingCanvas canvas){
		sprite = new VisibleImage(image, x, y, width, height, canvas);
	}
	
	void move(double x, double y){
		sprite.moveTo(sprite.getX() + x, sprite.getY() + y);
	}
	
	void moveTo(double x, double y){
		sprite.moveTo(x,y);
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
