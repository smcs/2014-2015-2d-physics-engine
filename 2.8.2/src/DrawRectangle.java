import objectdraw.*;
import java.awt.*;

public class DrawRectangle extends WindowController {
	private FramedRect box;

	public void onMousePress(Location pressPoint) {
		box = new FramedRect(pressPoint, 50, 50, canvas);
	}

	public void onMouseDrag(Location pressPoint) {
		box.moveTo(pressPoint);
	}

	public void onMouseRelease(Location pressPoint) {
		box.removeFromCanvas();
		new FilledRect(pressPoint, 50, 50, canvas);
	}
}
