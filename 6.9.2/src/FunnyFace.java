import objectdraw.*;

public class FunnyFace {

	public FunnyFace(DrawingCanvas canvas, double startX, double startY){
		
		new FramedOval(startX-7.5,startY+25,50,50,canvas);
		new FramedOval(startX+5,startY+40,5,5,canvas);
		new FramedOval(startX+25,startY+40,5,5,canvas);
	
	}
	
}
