import java.awt.*;
import java.util.Scanner;

import objectdraw.*;




public class Game extends WindowController {
	
	
	private int player1;
	private int player2;
	private int player3;
	
	public void begin(){
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the first number");
		//get user input for a
		player1 = reader.nextInt();
	}
	

}
