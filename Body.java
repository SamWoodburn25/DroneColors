
    /* Sam Woodburn
     * 10/20/23
     * SER110
     * practice 3- drones coloring
     * draggable ellipse/ body class- draws an ellipse by calling the super class and moves it wihen the mouse is dragged
     */

    import java.awt.Color;
    import java.awt.event.*;
    import wheels.users.*;

    public class Body extends Rectangle implements Draggable{
    	//instance variable
        private Color color;

        //constructor, takes a color parameter
        public Body(Color mainColor)
        {
            super(mainColor);
            this.color = Color.black;
        }

        public void drag(int dx, int dy)
        {
        	
        }
        
        //set color
        public void setCurrentColor(Color color) {
        	this.color = color;
        }

        //mouse event methods
        public void mouseDragged(MouseEvent e)
        {
        	this.setLocation(e.getX(), e.getY());
        }
        public void mouseClicked(MouseEvent e) {
    		this.setColor(color);
    	}
    }
    
    
    
    
    
        