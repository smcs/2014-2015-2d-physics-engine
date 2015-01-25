import objectdraw.*;
import java.awt.*;
import java.awt.color.*;

public class Tile {
	
	FilledRect tile;
	
	public Tile(char color, int xgrid, int ygrid, DrawingCanvas canvas){
		tile = new FilledRect(xgrid*11, ygrid*11, 10, 10, canvas);
		tile.setColor(red);
	}
	
	
}
