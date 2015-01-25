import objectdraw.*;
import java.awt.*;
import java.util.*;

public class Main extends WindowController{

	private int counter = 0;
	private String letters = "abcdefghij";
	private char character;
	private Vector<Character> list = new Vector<Character>();
	
	
	public void begin(){
		
		while(list.size()<10){

			character = letters.charAt((int)(Math.random()*10));
			
			if( !list.contains(character)){
				list.addElement(character);
				System.out.println("added "+ character);
			}else{
				System.out.println("repeated "+ character);
			}
			
			counter ++;
			
			
			
			
			
		}
		
		
		
		System.out.println(counter+" steps");
		
		
	}
		
		
	
	
}
