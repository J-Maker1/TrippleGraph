/**
* The DecoratedPlot class is an abstract class used to carry the details of other graphs over
* 
* @author Justin McGough
* @class_ID 70605
* @assignment 3
*/
import java.awt.Graphics;

public abstract class DecoratedPlot extends Drawable {
	protected Drawable drawable;
	
	/*
	 * Allows a class that inherits this class to store drawable data
	 * @param drawable used to input drawable data
	 */
	public void add(Drawable d) { drawable = d; }
	
	/*
	 * Sets the value of value inherited from Drawable
	 * @param value the integer that's input and stored in list
	 */
	@Override
	public void setValue(int value) {
		super.setValue(value);
	}
	
	/*
	 * draws the details of the stored drawable data
	 * @param g allows for the use of graphical commands
	 */
	@Override
	public void draw(Graphics g) { drawable.draw(g); }
}
