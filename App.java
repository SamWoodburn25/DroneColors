/*
 * Sam Woodburn
 * 10/20/23
 * SER110
 * practice 3- drones coloring
 * app class- draws the drones and color palette on the screen
 */

import wheels.users.*;
import java.awt.Color;

public class App extends Frame{
	
	//instance variables colors
	private ColorPanel gre;
	private ColorPanel blu;
	private ColorPanel re;
	private ColorPanel yel;
	private ColorPanel pin;
	
	//instance variables drones
	private Drone drone;
	private Drone droneBig;
	
	//app constructor
	public App() {
		//make one drone, set location and size
		this.drone = new Drone();
		drone.setSize(70, 50);
		drone.setLocation(100,200);
		//make second drone, set location and size
		this.droneBig = new Drone();
		droneBig.setSize(110, 90);
		droneBig.setLocation(300, 200);
		
		//make each color for the palette and set location
		this.gre = new ColorPanel(drone, droneBig, Color.green);
		gre.setLocation(50,20);
		this.blu = new ColorPanel(drone, droneBig, Color.blue);
		blu.setLocation(130, 20);
		this.re = new ColorPanel(drone, droneBig, Color.red);
		re.setLocation(210, 20);
		this.yel = new ColorPanel(drone, droneBig, Color.yellow);
		yel.setLocation(290,20);
		this.pin = new ColorPanel(drone, droneBig, Color.pink);
		pin.setLocation(370,20);
	}
	
	//main method to call app
	public static void main(String[] args) {
		new App();
	}
}
