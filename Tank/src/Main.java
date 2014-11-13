import objectdraw.*;

import java.awt.*;

public class Main extends WindowController {
	Tank tank1;
	Tank tank2;
	public void begin() {
		this.setSize(1365,800);
		Tank tank1 = new Tank (getImage("Tank Sprites/RedTankRight.gif"), (Math.random()*1200+70), (Math.random()*650)+75, 60, 40, canvas);
		Tank tank2 = new Tank (getImage("Tank Sprites/RedTankRight.gif"), (Math.random()*1200+70), (Math.random()*650)+75, 60, 40, canvas);
	}
	
	public void onMousePress(Location pressPoint){
		tank1.getX();
		//there is an error here. no commands for tank1 seem to work. i tested with move and moveTo as well
	}
}
