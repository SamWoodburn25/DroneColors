/*
 * Sam Woodburn
 * 10/29/23
 * SER110
 * practice 3- drones coloring
 * Drone class- draws the drones using the body and wing classes
 */

import wheels.users.*;
import java.awt.Color;

public class Drone {
	
	//instance variables
	protected Body body;
	protected Wing rWing;
	protected Wing lWing;
	
	//constructor
	public Drone(){
		this.body = new Body(Color.black);
		
		this.rWing = new Wing(Color.black, this);
		
		this.lWing = new Wing(Color.black, this);
	}
	
	//setter methods
	public void setLocation(int x, int y) {
		this.body.setLocation(x, y);
		this.rWing.setLocation(x+20,y-40);
		this.lWing.setLocation(x+20, y+50);
	}
	public void setSize(int x, int y) {
		this.body.setSize(x, y);
		this.lWing.setSize(x/2, y-10);
		this.rWing.setSize(x/2, y-10);
	}
	
	//getter methods
	public Body getBody() {
		return this.body;
	}
	public Wing getRWing() {
		return this.rWing;
	}
	public Wing getLWing() {
		return this.lWing;
	}
}
