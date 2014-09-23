
public class Sail {

	public static void main(String[] args) {
		
		//START SAIL
		for(int i=0; i < 10; ++i ){
			
			for(int z=9; i < z; --z ){
				System.out.print(" ");
			}
			
			System.out.print("*");
			
			for(int z=0; i > z; ++z ){
				System.out.print("**");
			}
			
			System.out.print("\n");
			
		}//END SAIL
		
		
		
		
		
		
		//START MAST
		for(int i=0; i < 3; ++i ){
			System.out.print("        ***\n");
		}//END MAST
			
			
			
			
		//START HULL
		
		for(int i=0; i < 5; ++i ){
			for(int z=0; z<i; ++z){
				System.out.print("  ");
			}
			for(int z=5; z>i; --z){
				System.out.print("****");
			}
		System.out.print("\n");
		}

		
		
		
	} // main		
}
