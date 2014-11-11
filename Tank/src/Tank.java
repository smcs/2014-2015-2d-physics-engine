import java.awt.*;
import objectdraw.*;

public class Tank extends OTOS{

	private double health;
	private double heat;
	private VisibleImage sprite;
		
	public Tank(Image img, double startX, double startY, DrawingCanvas canvas) {
		sprite = new VisibleImage(img, startX, startY, canvas);
	}
	
	
	
}
