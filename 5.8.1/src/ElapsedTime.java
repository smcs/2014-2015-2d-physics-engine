
import java.util.Timer;
import java.util.TimerTask;
import static java.lang.System.out;

public class ElapsedTime {
	Timer timer;
	private int elapsedTime = 0;
	
	class Task extends TimerTask {
	    public void run() {
	    	elapsedTime = elapsedTime + 1;
	    	System.out.println(elapsedTime);
	    }
	    	
	      
	private void begin(){

	    timer = new Timer();
	    timer.schedule(new Task(), 1 * 1000);
	}
	
	
	
	}
	
}
