import objectdraw.*;
import static java.lang.System.out;

public class RandomBox extends WindowController {
	private double height;
	private double width;
	private Location startPoint;

	private FilledRect box;

	public void begin() {
		drawBox();
	}

	public void drawBox() {
		canvas.clear();
		height = Math.random() * 100 + 20;
		width = Math.random() * 100 + 20;
		startPoint = new Location(100 - height / 2, 100 - width / 2);
		box = new FilledRect(startPoint, height, width, canvas);
	}

	public void onMousePress(Location pressPoint) {
		System.out.println("Location:" + startPoint);
		System.out.println("Height:" + height);
		System.out.println("Width:" + width);
	}

	public void onMouseEnter(Location pressPoint) {
		drawBox();
	}

	public void onMouseExit(Location pressPoint) {
		canvas.clear();
	}
}
