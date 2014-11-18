import objectdraw.*;
public class Sim extends WindowController{

	int numpressed = 0;
	int totalMoney = 0;
	public void onMousePress(Location l){
		canvas.clear();
		double rand = Math.random()*50;
		numpressed++;
		new Text(numpressed, 50, 65, canvas);
		new Text("ticket#: " + rand, 50, 50, canvas);

		if(rand <= 5){
			totalMoney = totalMoney + 200;
		}
		if(rand >= 5 && rand < 20){
			totalMoney = totalMoney + 100;
		}
		
		if(rand >= 20){
			totalMoney = totalMoney + 50;
		}
		new Text("Money: " + totalMoney, 50, 80, canvas);
	}
	
	
}
