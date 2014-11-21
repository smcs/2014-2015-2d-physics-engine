import java.awt.*;
import java.util.*;

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
	
	Vector<OTOS> overlaps(Vector<OTOS> everybody){
		Vector<OTOS> overlapped = new Vector<OTOS>();
		
		for (int counter = 0; counter<everybody.size(); counter++) {
			VisibleImage other = everybody.get(counter).sprite;
			
			if(   (other.getX() > sprite.getX() && other.getX() < sprite.getX()+sprite.getWidth())   ||    (other.getX() + other.getWidth() > sprite.getX() && other.getX() + other.getWidth() < sprite.getX()+sprite.getWidth())               &&        (other.getY() > sprite.getY() && other.getY() < sprite.getY()+sprite.getHeight())    ||       (other.getY() + other.getHeight() > sprite.getY() && other.getY() + other.getHeight() < sprite.getY()+sprite.getHeight()) ){
				overlapped.add(everybody.get(counter));
			}
//      				left xvalue of other is within sprite left and right x values														right xvalue of other is within sprite left and right x values															upper y value of other is contained by sprite y values											lower other y value is contained by sprite y values
//    				{                               								X value of other is contained by x values of sprite																							}						{														X value of other is contained by x values of sprite																													}
		
			
			
		}
		return overlapped;
		
	}
	

}
