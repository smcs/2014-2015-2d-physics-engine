


Timer.class

	//timer//
	while(true statement){
		system.wait(1000)
	}

Bullet.class(heading, x, y){
		on begin()){
			set position to given x,y
			point in heading (only up down left right)
			
		}
		
		while not touching anything{
			move 1 pixel in heading direction
			wait .o1 seconds
		}
		
		on collision(){
			if tank1{
				tank1.lowerhealth
			}
			if tank2{
				tank2.lowerhealth
			}
			
			removefromcanvas()
		}

Tank.class

	Extends OTOS

	Location TankLocation = math.random, math.random
	Int Overheat
	Int TankDirection
	Int Health
	
	// initalize all variables


	Public Class OnKeyPressed(LastKey){
		Int LastKey
		If LastKey = w
			Go Forward
		If LastKey = s
			Go backwards
		If LastKey = a
			Go left
		If LastKey = d
			Go right
		If LastKey = f
			fireBullet()
	}

	fireBullet(){
		change heat by 10
		call a new bullet class with a direction and start position
	}
	
	lowerhealth(int x){
		health = health-x
	}
	
	
OTOS.class{
	
	begin(picture, position, etc){
	//set up picture
	}
	
	// methods to get attributes of OTOS (location, picture, speed, etc)
	
	//methods to do things to OTOS (move, change picture, etc)
	
	
Wall.class extends OTOS{
	new otos with dark grey rectangle as picture, predetermined location
}

Main.class{
	Tank tank1
	tank tank2
	
	tank1 = new tank
	tank2 = new tank
	tank1.setpicture(red tank)
	tank2.setpicture(blue tank)
	keylistener(moves tanks when used)
	
	when a tanks health > 0{
		remove everything from canvas
		new text "game is over" + tank with positive health + "wins"
	}
}

	
	
}
	
	
	
	

