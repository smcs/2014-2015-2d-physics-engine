import java.util.*;

import objectdraw.*;
public class Main extends WindowController {
	
	
	
	
	private Vector <Integer> numberList  = new Vector<Integer>(10);
	
	
	
	public void printString(){

		for(int i = 0; i<10; i++){
			System.out.print(numberList.get(i));
		}
		System.out.println();
	}
	
	
	
	
	

	
	
	

	public void begin(){
		for(int i = 0; i<10; i++){
			
			numberList.addElement((int) (Math.random()*100));
		}
		printString();
	}
	
	
	
	
	
	public void onMousePress(Location l){
		printString();
	}
}
