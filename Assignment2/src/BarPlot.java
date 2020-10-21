/**
* The MarkedPlot class extends DecoratedPlot so as to display a the previous markedPlot
* graph and build upon it with gray bars at each point in the list
* 
* @author Justin McGough
* @class_ID 70605
* @assignment 3
*/

import java.awt.*;

public class BarPlot extends DecoratedPlot{
	
	/*
	 * draws the previous graph and the goes through each point in the list
	 * to draw a gray bar below it
	 * @param g used for graphical functions
	 */
	public void draw(Graphics g) {
		drawable.draw(g);
		g.setColor(Color.GRAY);
		for(int index = 0; index < list.size(); index++){
			g.fillRect((index * 20) - 5, list.get(index) + 5, 10, 250 - (list.get(index)));
		}
		
	}
}
