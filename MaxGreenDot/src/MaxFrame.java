import java.awt.Color;

import javax.swing.JFrame;


public class MaxFrame extends JFrame {
	
	//Class  FIELDS
	 int fWidth;
	 int fHeight;
	
	Color fColor = Color.green;
	Color fColor2 = new Color(0, 255, 125);
	
	
	public MaxFrame(int w, int h){
		fWidth = w;
		fHeight = h;
		
		this.setSize(fWidth, fHeight);
		this.setBackground(fColor);
		
		
	}
	
	
	
	
	

}
