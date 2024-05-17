/* Sam Woodburn
 * 10/29/23
 * SER110
 * practice 3- drones coloring
 * draggable interface- has the abstract method drag for other classes to implement
 */

import java.awt.event.*;

public interface Draggable {
    public void drag(int dx, int dy);
}