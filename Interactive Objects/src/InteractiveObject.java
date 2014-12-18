import java.awt.*;
import java.util.Vector;

import objectdraw.*;




/*I am getting a null pointer exception from the method overlaps, which should return a vector of InteractiveObjects called 
overlapped. I think that there is an initialization error with overlapped, and that the method is passing around a null 
reference to the vector overlapped. I am also not entirely sure where and how to initialize that vector.
*/


public class InteractiveObject{

	protected VisibleImage sprite;

	protected static Vector<InteractiveObject> allObjects = null;
	//do I want this to be static? if it is, will that mean that it is the same for all InteractiveObjects
	

	public InteractiveObject(Image i, double x, double y, double width, double height, DrawingCanvas canvas) {
		sprite = new VisibleImage(i, x, y, width, height, canvas);
	}
	
	public InteractiveObject(Image i, int x, int y, double width, double height, DrawingCanvas canvas) {
		sprite = new VisibleImage(i, x, y, width, height, canvas);
	}
	
	public InteractiveObject(Image i, long x, long y, double width, double height, DrawingCanvas canvas) {
		sprite = new VisibleImage(i, x, y, width, height, canvas);
	}
	
	public InteractiveObject(Image i, Location l, double width, double height, DrawingCanvas canvas) {
		sprite = new VisibleImage(i, l, width, height, canvas);
	}
	
	public InteractiveObject(Image i, int x, int y, DrawingCanvas canvas) {
		sprite = new VisibleImage(i, x, y, canvas);
	}

	
	
	
	
	
	public void moveTo(int x, int y){
		sprite.moveTo(x,y);
	}
	
	public void moveTo(long x, long y){
		sprite.moveTo(x,y);
	}
	
	public void moveTo(Location l){
		sprite.moveTo(l);
	}
	
	
	
	
	
	
	
	
	
	
	//all code until next comment has been copied out of Tank Wars and should be consider guilty until proven innocent
	//the method overlaps should return a vector of InteractiveObjects contained within the boundingbox of the InteractiveObject using it

	
	public Vector<InteractiveObject>overlaps(){
		
		Vector<InteractiveObject> overlapped = null; //is this where i should initialize overlapped? If so, should it start out null? is there a way to initialize it as an empty vector?

		
		
		
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
	
	//end copied code
	
	
}
