import objectdraw.*;

public class FunnyFace {
	
	FramedOval facepart;
	FramedOval eye1;
	FramedOval eye2;
	
	public FunnyFace(DrawingCanvas canvas, double startX, double startY){
	facepart = new FramedOval(startX-7.5,startY+25,50,50,canvas);
	eye1 = new FramedOval(startX+5,startY+40,5,5,canvas);
	eye2 = new FramedOval(startX+25,startY+40,5,5,canvas);
	}
	
	public boolean containsPoint(Location point){
		return facepart.contains(point) || eye1.contains(point) || eye2.contains(point);
	}
	
	
		
		
	
	}
	

