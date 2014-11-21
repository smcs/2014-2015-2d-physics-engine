import java.awt.Image;

import objectdraw.DrawingCanvas;


public class Wall extends OTOS {

	private char orient;
	
	public Wall(Image image, double x, double y, DrawingCanvas canvas, char orientation, double height, double width) {
		super(image, x, y, width, height, canvas);
		
		orient = orientation;
		rotate();
			
		}
		
	public void rotate(){
		if(orient == 'v'){
			//set image and width/height
		}
		
		if(orient == 'h'){
			//set image and width/height
		}
		
	
	}
	


}
