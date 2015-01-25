import java.util.Vector;


public class Bubble {
	
	private boolean flag = true; 
	private int swap;
	
	void sort(Vector<Integer> list){
		
		while(flag == true){
			
			flag = false;
		
			for(int i = 0; i<list.size()-1; i++){
				
				if (list.get(i)>list.get(i+1)){
					swap = list.get(i);
					list.set(i, list.get(i+1));
					list.set(i+1, swap);
					flag = true;
				}	
				
			}
		}
		System.out.print("Bubble Sort: ");
		for(int i = 0; i<10; i++){
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
			
			
			
			
	
			
	}
	
	
	
	
}
