import java.awt.*;

import objectdraw.*;

public class ElapsedTime extends WindowController {
private long starttime;
private boolean counting = false;

public void onMousePress(Location presspoint){
	if(counting == false){
		canvas.clear();
		new Text("recording time", 30, 30, canvas);
		starttime = System.currentTimeMillis();
		counting = true;
	}else{
		canvas.clear();
		new Text(System.currentTimeMillis() - starttime, 30, 30, canvas);
		counting = false;
	}
	
		
		



}














}





	
	
	
