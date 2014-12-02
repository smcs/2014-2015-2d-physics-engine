import java.awt.Image;
import java.awt.event.*;

import objectdraw.*;

public class Keyboard extends ActiveObject implements KeyListener {

	
	Tank tank1, tank2;
	Bullet b;
	Image bulletImage;
	boolean keyDown;
	int lastKey;
	
	public Keyboard(Tank tank1, Tank tank2, Bullet b) {
		this.tank1 = tank1;
		this.tank2 = tank2;
		this.b = b;
		this.start();
	}
	
	
	
	
	int tankDirection(){
		return lastKey;
	}
	
	
	
	
	
	public void run() {
		while (true) {
			if(keyDown == true){
				if(lastKey == KeyEvent.VK_W){
					tank1.move(0, -2);
				}
				if(lastKey == KeyEvent.VK_A){
					tank1.move(-2, 0);
				}
				if(lastKey == KeyEvent.VK_S){
					tank1.move(0, 2);
				}
				if(lastKey == KeyEvent.VK_D){
					tank1.move(2, 0);
				}
				if(lastKey == KeyEvent.VK_F){
				b = Main.newBullet(tank1.getX(), tank1.getY(), 'w');
				}
			}
			try {
				Thread.sleep(25);
			} catch (InterruptedException e1) {
				// do nothing
			}

		}
	}
	
	

	@Override
	public void keyPressed(KeyEvent e) {
		
		keyDown = true;
		lastKey = e.getKeyCode();
	}

		
	
	
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		if(lastKey == e.getKeyCode()){
			keyDown = false;
		}

	}


	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
