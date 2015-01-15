import java.util.Vector;


public class SelectionSort {

	private Vector <Integer> sorted;
	private int flag = 0;
	
	void sort(Vector <Integer> unsorted){
		sorted = new Vector <Integer> ();
		while (unsorted.size() > 0){
			
			for(int i = 0; i < unsorted.size(); i++){
				if(unsorted.get(i)>unsorted.get(flag)){
					flag = i;
				}
			}
			sorted.add(0, unsorted.get(flag));
			unsorted.remove(flag);
			
			
		}
		
		
		
		for(int i = 0; i<sorted.size(); i++){
			System.out.print(sorted.get(i) + " ");
		}
		System.out.println();
	}
	
}
