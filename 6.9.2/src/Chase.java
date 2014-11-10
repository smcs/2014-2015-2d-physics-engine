import objectdraw.*;

public class Chase extends WindowController{

	private double startX;
	private double startY;
	private long startTime;
	private TopHat hat;
	private FunnyFace face;
	public void begin() {
		startTime = System.currentTimeMillis();
		this.setSize(800,800);
		canvas.clear();
		startX = Math.random()*700;
		startY = Math.random()*700;
		hat = new TopHat(canvas, startX, startY);
		face = new FunnyFace(canvas, startX, startY);
		
	}
	
	public void onMousePress( Location pressPoint){
		if( System.currentTimeMillis() - startTime > 2000 || !hat.containsPoint(pressPoint) && !face.containsPoint(pressPoint)){
			hat.turnRed();
		}
	}
		
	public void onMouseRelease(Location pressPoint){
		startTime = System.currentTimeMillis();
		canvas.clear();
		startX = Math.random()*700;
		startY = Math.random()*700;
		hat = new TopHat(canvas, startX, startY);
		new FunnyFace(canvas, startX, startY);
	}
}
	
		
	
	
	

