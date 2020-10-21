/**
* The SimplePlot class is what generates the graph of line segments that point to each generated value
* 
* @author Justin McGough
* @class_ID 70605
* @assignment 3
*/
import java.awt.Color;
import java.awt.Graphics;

public class SimplePlot extends Drawable{
	
	/*
	 * The draw class creates black lines that link each point stored in the list
	 * @param g allows for graphical commands to be issued
	 */
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		for(int index = 0; index < list.size(); index++) {
			if(index != list.size()-1) {
				g.drawLine(index * 20, list.get(index), (index + 1) * 20, list.get(index + 1));
			}
		}
	}
}
