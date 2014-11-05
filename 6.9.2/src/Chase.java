import objectdraw.*;

public class Chase extends WindowController{

	private double startX;
	private double startY;
	private long startTime;
	
	public void begin() {
		startTime = System.currentTimeMillis();
		this.setSize(800,800);
		canvas.clear();
		startX = Math.random()*700;
		startY = Math.random()*700;
		new TopHat(canvas, startX, startY);
		new FunnyFace(canvas, startX, startY);
		
	}
	
	public void onMousePress( Location pressPoint){
		if( System.currentTimeMillis() - startTime > 3000){
			new Text ("it got here", 60, 60, canvas);
			
			//TopHat.TurnRed();
		}
	}
		
	public void onMouseRelease(Location pressPoint){
		startTime = System.currentTimeMillis();
		canvas.clear();
		startX = Math.random()*700;
		startY = Math.random()*700;
		new TopHat(canvas, startX, startY);
		new FunnyFace(canvas, startX, startY);
	}
}
	
		
	
	
	

