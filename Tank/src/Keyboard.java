import java.awt.Image;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;

import objectdraw.*;

public class Keyboard extends ActiveObject implements KeyListener {

	Tank tank1, tank2;
	Image bulletImage;
	boolean keyDown;
	int lastKey;
	
 
			
		
	public Keyboard(Tank tank1, Tank tank2, Bullet b) {
		this.tank1 = tank1;
		this.tank2 = tank2;
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("Tank Sprites/RedTankLeft.gif"));
		} catch (IOException e) {
			// ignore any exceptions
		}
		bulletImage = img;

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
					if(tank1.overlaps().size()>0){
						tank1.move(0, 2);
					}
				}
				if(lastKey == KeyEvent.VK_A){
					tank1.move(-2, 0);
					if(tank1.overlaps().size()>0){
						tank1.move(2, 0);
					}
				}
				if(lastKey == KeyEvent.VK_S){
					tank1.move(0, 2);
					if(tank1.overlaps().size()>0){
						tank1.move(0, -2);
					}
				}
				if(lastKey == KeyEvent.VK_D){
					tank1.move(2, 0);
					if(tank1.overlaps().size()>0){
						tank1.move(-2, 0);
					}
				}
				if(lastKey == KeyEvent.VK_F){
				
					new Bullet(bulletImage, tank1.getX(), tank1.getY(), 'w', tank1.getCanvas(), tank1.getEverybody());
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}
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
