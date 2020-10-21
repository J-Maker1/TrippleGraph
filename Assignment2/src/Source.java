/**
* The Source program uses observable and is what's responsible for defining
* the height of each point on the graphs.
* 
* @author Justin McGough
* @class_ID 70605
* @assignment 3
*/
import java.util.Observable;

public class Source extends Observable{
	
	private int value;
	
	/*
	 * The create method creates a random value between 1 and 250 along with using observe to signal a change.
	 */
	public void create() {
		value = (int) ((Math.random() * 250) + 1);
		setChanged();
		notifyObservers();
	}
	
	/*
	 * The getValue method just return value
	 */
	public int getValue() {
		return value;
	}
}
