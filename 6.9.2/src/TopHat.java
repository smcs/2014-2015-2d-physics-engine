import objectdraw.*;
import java.awt.Color;

public class TopHat {
	FilledRect rect;
	FilledOval oval1;
	FilledOval oval2;
	
	public void TurnRed(){
		rect.setColor(Color.red);
		oval1.setColor(Color.red);
		oval2.setColor(Color.red);
	}
	
	public TopHat(DrawingCanvas canvas, double startX, double startY){
		rect.setColor(Color.black);
		oval1.setColor(Color.black);
		oval2.setColor(Color.red);

		rect = new FilledRect(startX,startY-30,35,60,canvas);
		oval1 = new FilledOval(startX,startY-35,35,10,canvas);
		oval2 = new FilledOval(startX-15,startY+20,65,15,canvas);
	}
	
	
}
