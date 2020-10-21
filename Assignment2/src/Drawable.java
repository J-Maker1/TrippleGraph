/**
* The Drawable class is an abstract class that can be used to store
* the list of each plot's value/height along with having parameters 
* set to keep the list no longer than 20
* 
* @author Justin McGough
* @class_ID 70605
* @assignment 3
*/
import java.awt.*;
import java.util.LinkedList;

public abstract class Drawable {
	protected LinkedList<Integer> list = new LinkedList<Integer>();
	//list is made a global variable
	
	/*
	 * Stores a value into the list unless there are already 20 values
	 * in which case we delete the first one, makeing the list shift down
	 * and place a new one at the front
	 */
	public void setValue(int v) {
		list.add(v);
		if(list.size() > 20) {
			list.remove(0);
		}
	}
	
	/*
	 * Continuing to carry the graphical g
	 */
	public void draw(Graphics g) {
		
	}
}
