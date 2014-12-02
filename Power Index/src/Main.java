import objectdraw.*;
public class Main extends WindowController {

	int counter = 0;
	int aIncrement;
	int bIncrement;
	int cIncrement;
	
	char oneSlot;
	char twoSlot;
	char threeSlot;
	
	public void begin(){
		while(counter<30){
			counter++;
			if(counter-1 != 0){
				if((counter-1)/3 == (int)(counter-1)/3){
					oneSlot = 'a';
				}
				if((counter-1)/3 == (int)(counter-2)/3){
					oneSlot = 'b';
				}
				if((counter-1)/3 == (int)(counter-3)/3){
					oneSlot = 'c';
				}
				System.out.print(oneSlot);
				System.out.println();
				
			}else{
				oneSlot = 'a';
			}
		}
	}
	
	
	
	
}


