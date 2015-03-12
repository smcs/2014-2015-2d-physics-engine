import java.awt.*;
import java.awt.geom.Rectangle2D;
import objectdraw.*;


public class InteractiveObject {
	protected VisibleImage sprite;
	protected Rectangle2D.Float boundingBox;
	public InteractiveObject(Image i, int x, int y, int w, int h, DrawingCanvas canvas){
		sprite = new VisibleImage(i, x, y, w, h, canvas);
		boundingBox = new Rectangle2D.Float(x, y, w, h);
	}
	public void moveTo(int x, int y){
		sprite.moveTo(x,y);
		boundingBox.
	}
	public void move(int x, int y){
		sprite.move(x, y);
	}
	
	
	
}
