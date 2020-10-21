/**
* The World program creates instances of each graph class into a single visual window
* were a button is present to change the state of the graphs.
* 
* @author Justin McGough
* @class_ID 70605
* @assignment 3 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class World extends JFrame implements ActionListener{
	Source source = new Source();
	//Need to create Source as a global variable
	
	/**
	* This constructor creates the plot graphs and places then into one window
	* along with linking them to source and button.
	* 
	*/
	public World() {
		SimplePlot simplePlot = new SimplePlot();
		MarkedPlot markedPlot = new MarkedPlot();
		markedPlot.add(simplePlot);
		BarPlot barPlot = new BarPlot();
		barPlot.add(markedPlot);
		
		PlotPanel panelOne = new PlotPanel(simplePlot);
		PlotPanel panelTwo = new PlotPanel(markedPlot);
		PlotPanel panelThree = new PlotPanel(barPlot);
		
		JButton button = new JButton("Run");
		button.addActionListener(this);
		
		setLayout(new GridLayout(4,1));
		add(panelThree);
		add(panelTwo);
		add(panelOne);
		add(button);
		
		
		source.addObserver(panelOne);
		source.addObserver(panelTwo);
		source.addObserver(panelThree);
		
	}
	/*
	* The main method creates the main window along with it's size
	* @param args Unused
	* @return Nothing
	*/
	public static void main(String[] args) {
		World world = new World();
		world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		world.setSize(400, 1020);
		world.setVisible(true);
	}
	/*
	 * The actionPerformed method defines the behavior of button when pressed
	 * @param e uses the implemented class ActionListener
	 */
	public void actionPerformed(ActionEvent e) {
		source.create();
	}

}