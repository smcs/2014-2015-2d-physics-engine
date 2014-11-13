import objectdraw.*;

import java.awt.*;
import java.awt.event.*;

public class Main extends WindowController implements KeyListener {
	Tank tank1;
	Tank tank2;
	public void begin() {
		this.setSize(1365,800);
		tank1 = new Tank (getImage("Tank Sprites/RedTankRight.gif"), (Math.random()*1200+70), (Math.random()*650)+75, 60, 40, canvas);
		tank2 = new Tank (getImage("Tank Sprites/RedTankRight.gif"), (Math.random()*1200+70), (Math.random()*650)+75, 60, 40, canvas);
		
		canvas.addKeyListener(this);
	}
	
	public void onMousePress(Location pressPoint){
		tank1.getX();
		//there is an error here. no commands for tank1 seem to work. i tested with move and moveTo as well
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_G) {
			System.out.println("woo hoo!");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
