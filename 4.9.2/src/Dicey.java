import java.util.Random;

import objectdraw.*;
import static java.lang.System.out;

public class Dicey extends WindowController {
	
private Random rand = new Random();
private int diceRoll1;
private int diceRoll2;
private int diceRoll3;

	public void begin(){
		new Text("click the mouse to roll", 10, 50, canvas);
	}
	
	public void onMousePress(Location pressPoint){
		canvas.clear();
		
		diceRoll1 = rand.nextInt(7);	
		diceRoll2 = rand.nextInt(7);
		diceRoll3 = rand.nextInt(7);
		
		new Text("you rolled " + diceRoll1 + ", " + diceRoll2  + ", "+ diceRoll3, 10, 50, canvas);
		
		if(diceRoll1 == diceRoll2 && diceRoll1 == diceRoll3){
			new Text("you rolled triples", 10, 70, canvas);
		}else if(diceRoll1 == diceRoll2 || diceRoll1 == diceRoll3 || diceRoll2 == diceRoll3){
			new Text("you rolled doubles", 10, 70, canvas);
		}else{
			new Text("your roll had nothing special", 10, 70, canvas);
		}

	
	}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

