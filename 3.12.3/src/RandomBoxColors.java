import objectdraw.*;
import java.awt.*;
import java.util.Random;
import static java.lang.System.out;

public class RandomBoxColors extends WindowController {
	private double height;
	private double width;
	private Location startPoint;
	private Random rand = new Random();
	private Color randomColor;
	private FilledRect box;
	private FramedRect boxframe;
	private int red;
	private int green;
	private int blue;

	public void begin() {
		drawBox();
	}

	public void drawBox() {
		canvas.clear();
		red = rand.nextInt(256);
		green = rand.nextInt(256);
		blue = rand.nextInt(256);
		randomColor = new Color(red, green, blue);
		height = Math.random() * 100 + 20;
		width = Math.random() * 100 + 20;
		startPoint = new Location(100 - height / 2, 100 - width / 2);
		box = new FilledRect(startPoint, height, width, canvas);
		box.setColor(randomColor);
		boxframe = new FramedRect(startPoint, height, width, canvas);
	}

	public void onMousePress(Location pressPoint) {
		System.out.println("Location:" + startPoint);
		System.out.println("Height:" + height);
		System.out.println("Width:" + width);
		System.out.println("Red:" + red);
		System.out.println("Green:" + green);
		System.out.println("Blue:" + blue);
	}

	public void onMouseEnter(Location pressPoint) {
		drawBox();
	}

	public void onMouseExit(Location pressPoint) {
		canvas.clear();
	}
}
