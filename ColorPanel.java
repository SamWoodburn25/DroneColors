/*
 * Sam Woodburn
 * 10/29/23
 * SER110
 * practice 3- drones coloring
 * colorPanel class- creates an ellipse using the super class, changes the current color when clicked
 */

import wheels.users.*;
import java.awt.Color;
import java.awt.event.MouseEvent;

public class ColorPanel extends Ellipse{
	//instance variables
	private Drone drone;
	private Drone droneBig;
	private Color color;
	
	public ColorPanel(Drone drone, Drone droneBig, Color color) {
		super(color);
		this.setSize(50,50);
		this.drone = drone;
		this.droneBig = droneBig;
		this.color = color;
	}
	
	//when the mouse is clicked on that ellipse, change the current color to this color
	public void mouseClicked(MouseEvent e) {
		drone.body.setCurrentColor(color);
		drone.rWing.setCurrentColor(color);
		drone.lWing.setCurrentColor(color);
		
		droneBig.body.setCurrentColor(color);
		droneBig.rWing.setCurrentColor(color);
		droneBig.lWing.setCurrentColor(color);
	}
	
}