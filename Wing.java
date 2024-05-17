
    
    /* Sam Woodburn
     * 10/29/23
     * SER110
     * practice 3- drones coloring
     * Wing ellipse class- extends the ellipse class and makes it clickable & draggable
     */

    import java.awt.Color;
    import java.awt.event.*;
    import wheels.users.*;

    public class Wing extends Ellipse implements Draggable{
    	//instance variables
        private Drone drone;
        private Color color;

        //constructor
        public Wing(Color mainColor, Drone drone)
        {
            super(mainColor);
            this.color = Color.black;
            this.drone = drone;
        }

        //must implement from the interface
        public void drag(int dx, int dy)
        {
        	
        }
        
        public void setCurrentColor(Color color) {
        	this.color = color;
        }

        //mouse event methods
        public void mouseDragged(MouseEvent e)
        {
        	this.drone.setLocation(e.getX(), e.getY());
        }
        public void mouseClicked(java.awt.event.MouseEvent e) {
    		this.setColor(color);
    	}
    }
    
    
    
    
    
    