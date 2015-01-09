import objectdraw.*;

import java.awt.*;
import java.util.*;

public class test extends WindowController{
	
	
	private boolean testVar = true;
	private int counter = 0;
	
	public void begin(){
		while(testVar == true && counter <10){
			System.out.print(counter);
			counter ++;
			testVar = false;
		}
	}
	

	
	
}
