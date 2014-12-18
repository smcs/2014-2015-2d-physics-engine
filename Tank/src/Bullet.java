import java.awt.*;
import java.util.*;

import objectdraw.*;

public class Bullet extends OTOS implements Runnable {

	private char heading;

	Bullet(Image i, int x, int y, char h, DrawingCanvas canvas,
			Vector<OTOS> everybody) {
		super(i, x, y, 5, 5, canvas);
		this.everybody = everybody;
		heading = h;
		new Thread(this).start();
		everybody.add(this);
	}

	Bullet(Image i, double x, double y, char h, DrawingCanvas canvas,
			Vector<OTOS> everybody) {
		super(i, x, y, 5, 5, canvas);
		this.everybody = everybody;
		heading = h;
		new Thread(this).start();
		everybody.add(this);
	}

	OTOS hitObject;

	public void run() {
		Vector<OTOS> overlaps;
		do {
			if (heading == 'w') {
				this.moveTo(this.getX(), this.getY() - 1);
				try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
				}
			}
			if (heading == 'a') {
				this.moveTo(this.getX() - 1, this.getY());
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
			}
			}
			if (heading == 's') {
				this.moveTo(this.getX(), this.getY() + 1);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
			}
			}
			if (heading == 'a') {
				this.moveTo(this.getX() + 1, this.getY());
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
			}
			}
			overlaps = overlaps();
		} while (overlaps.size() == 0);

		hitObject = overlaps.elementAt(0);

	}
}
