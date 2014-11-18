import java.awt.*;
import java.util.*;
import objectdraw.*;

public class Tank extends OTOS{
	
	private double health = 10;
	private double heat = 0;
	private Image left, right, up, down;
	private Vector<OTOS> everybody;
	
	
	
	public Tank(Image left, Image right, Image up, Image down, double x, double y, int w, int h, DrawingCanvas canvas, Vector<OTOS> everybody) {
		super(right, x, y, w, h, canvas);
		this.left = left;
		this.right = right;
		this.up = up;
		this.down = down;
		this.everybody = everybody;
	}
	
	void lowerHealth(double h){
		health = health - h;
	}
	

	
	
	void move(double x, double y){
		sprite.moveTo(sprite.getX() + x, sprite.getY() + y);
		if(x>0){
			sprite.setImage(right);
			sprite.setHeight(40);
			sprite.setWidth(60);
		}
		if(x<0){
			sprite.setImage(left);
			sprite.setHeight(40);
			sprite.setWidth(60);
		}
		if(y>0){
			sprite.setImage(down);
			sprite.setHeight(60);
			sprite.setWidth(40);
		}
		if(y<0){
			sprite.setImage(up);
			sprite.setHeight(60);
			sprite.setWidth(40);
		}
	}
	
	
}
