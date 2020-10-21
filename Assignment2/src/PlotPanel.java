/**
* The PlotPanel class acts as a panel to store graphical creation on.
* Along with this, it uses observer to act when change occurs in the World class/
* 
* @author Justin McGough
* @class_ID 70605
* @assignment 3
*/

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class PlotPanel extends JPanel implements Observer{
	Drawable drawable;
	
	/*
	 * PlotPanel method adds a graphical 'drawing' to the object drawing
	 * @paramm drawable, stores drawing data
	 */
	public PlotPanel(Drawable drawable) {
		this.drawable = drawable;
	}
	
	/*
	 * Uses observable to know when a new value must be generated
	 */
	@Override
	public void update(Observable o, Object arg) {
		drawable.setValue (((Source)o).getValue());
		repaint();
	}
	
	/*
	 * clears previously drawn components and redraws the updated graphs.
	 * @param g is what is used to run graphical commands
	 */
	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		if (drawable !=null) {
			drawable.draw(g);
		}
	}
	
}

