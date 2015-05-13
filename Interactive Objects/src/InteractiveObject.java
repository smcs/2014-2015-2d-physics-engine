import java.awt.*;
import java.util.Vector;

import objectdraw.*;





public class InteractiveObject implements Runnable{

	protected VisibleImage sprite;
	protected double xVelocity = 0;
	protected double yVelocity = 0; 
	protected int xPosition = 0;
	protected int yPosition = 0;
	private DrawingCanvas drawingCanvas;
	private boolean resting = false;
	
	
	public InteractiveObject(Image i, double x, double y, double width, double height, DrawingCanvas canvas) {
		sprite = new VisibleImage(i, x, y, width, height, canvas);
		allObjects.addElement(this);
		drawingCanvas = canvas;
		new Thread(this).start();
	}
	
	public InteractiveObject(Image i, int x, int y, double width, double height, DrawingCanvas canvas) {
		sprite = new VisibleImage(i, x, y, width, height, canvas);
		allObjects.addElement(this);
		drawingCanvas = canvas;
		new Thread(this).start();
	}
	
	public InteractiveObject(Image i, long x, long y, double width, double height, DrawingCanvas canvas) {
		sprite = new VisibleImage(i, x, y, width, height, canvas);
		allObjects.addElement(this);
		drawingCanvas = canvas;
		new Thread(this).start();
	}
	
	public InteractiveObject(Image i, Location l, double width, double height, DrawingCanvas canvas) {
		sprite = new VisibleImage(i, l, width, height, canvas);
		allObjects.addElement(this);
		drawingCanvas = canvas;
		new Thread(this).start();
	}
	
	public InteractiveObject(Image i, int x, int y, DrawingCanvas canvas) {
		sprite = new VisibleImage(i, x, y, canvas);
		allObjects.addElement(this);
		drawingCanvas = canvas;
		new Thread(this).start();
	}

	

	protected static Vector<InteractiveObject> allObjects = new Vector<InteractiveObject>();

	public void bounceRight(){
		if(xVelocity>0){
			xVelocity = (int)(xVelocity*(-.9));
			}
			}
	
	public void bounceLeft(){
		if(xVelocity<0){
			xVelocity = (int)(xVelocity*(-.9));
			}
		}
	public void bounceTop(){
		if(yVelocity<0){
			yVelocity = (int)(yVelocity*(-.9));
			}
		}
	
	public void bounceBottom(){
		if(yVelocity>0){
			yVelocity = (int)(yVelocity*(-1));
			}
		}

	
	public void move(){

		if(!(yVelocity<.5 && sprite.getHeight()+sprite.getY() >= drawingCanvas.getHeight())){
			yVelocity = yVelocity + 1.5;
		}

		
		xVelocity = (xVelocity*0.99);
		yVelocity = (yVelocity*0.99);
		xPosition = (int)(xPosition + xVelocity);
		yPosition = (int)(yPosition + yVelocity);
		
		
		sprite.move(xVelocity, yVelocity);
		
		
		if(sprite.getHeight()+sprite.getY() >= drawingCanvas.getHeight()){
			if(yVelocity>.1){
				bounceBottom();
			}else{
				yPosition = (int) (drawingCanvas.getHeight() - sprite.getHeight());
			}
				
		}
		
		
		if(sprite.getY() <= 0){
			bounceTop();
		}
		
		if(sprite.getWidth()+sprite.getX() >= drawingCanvas.getWidth()){
			bounceRight();
			}
		
		if(sprite.getX() <= 0){
			bounceLeft();
		}
		
		if(overlaps().size()>0){
			if((overlaps().get(0).xPosition + overlaps().get(0).sprite.getHeight()) <= sprite.getX() && overlaps().get(0).sprite.getX() > sprite.getX()){
				bounceTop();
			}
			if((overlaps().get(0).xPosition + overlaps().get(0).sprite.getHeight()) >= sprite.getX() && overlaps().get(0).sprite.getX() > sprite.getX()){
				bounceBottom();
			}
		}
		
		
		
		
		
	}

	
	
	

	
	
	
	
	
	public void moveTo(int x, int y){
		sprite.moveTo(x,y);
		resting = false;
	}
	
	public void moveTo(long x, long y){
		sprite.moveTo(x,y);
		resting = false;
	}
	
	public void moveTo(Location l){
		sprite.moveTo(l);
		resting = false;
	}
	
	
	
	
	
	
	
	
	
	

	
	public Vector<InteractiveObject>overlaps(){
		
		Vector<InteractiveObject> overlapped = new Vector <InteractiveObject>(10);

		
		
		
		for (int counter = 0; counter < allObjects.size(); counter++) {
			
			VisibleImage other = allObjects.get(counter).sprite;
			
			
			
			if (other != this.sprite) {

				
				
				if (((other.getX() > sprite.getX() 					&& 					other.getX() < sprite.getX() + sprite.getWidth())   		||			 (other.getX() + other.getWidth() > sprite.getX()			 && 				other.getX() + other.getWidth() < sprite.getX() + sprite.getWidth()))		&&			 ((other.getY() > sprite.getY() && other.getY() < sprite.getY() + sprite.getHeight()) 		||			 (other.getY()	+ other.getHeight() > sprite.getY() && other.getY() + other.getHeight() < sprite.getY() + sprite.getHeight()))) 
			// left xvalue of other is within sprite left and right x values 			right xvalue of other is within sprite left and right x					 values upper y value of other is contained by sprite y values				 lower other y value is contained by sprite y values          								  X value of other is contained by x values of sprite      															 value of other is contained by x values of sprite 
				
			// if any part of the boundingbox of other is within the boundingbox of the InteractiveObject that
			// this method is called for, this expression returns true
				
					
					
				{
					overlapped.add(allObjects.get(counter));
				}
				// this adds the interactive object other ( number counter on everybody)  to the the vector 

				
				

			}

		}
		return overlapped;

	}

	@Override
	public void run() {
		while(true){
			
			move();
			
			
			
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	
	
}
