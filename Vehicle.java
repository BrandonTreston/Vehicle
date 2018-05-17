import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
/**
 * @author Brandon Treston
 * 
 * Creates a "vehicle" out of basic shapes.
 */
public class Vehicle extends JComponent {
	/**
	 * @Constructor creates the Vehicle object.
	 */
	public Vehicle(){
		x=100;
		y=100;
	}
	
	/**
	 * Draws a circle as tires and a rectangle as a body.
	 * note: circles are actually bound in rectangles.
	 * @param g the Graphics object that is casted to Graphics2D to paint the shapes.
	 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawOval(x, y, width, height);
		g2.drawOval(x+50, y, width, height);
		g2.drawRect(x, y-20, width+50, height);
	}
	/**
	 * generates a random position to display the vehicle.
	 */
	public void generateRandom() {
		RandomGenerator r = new RandomGenerator();
		x = r.generate();
		y = r.generate();	
		}
	/**
	 * @return x coordinate
	 */
	public int getx() {
		return x;
	}
	/**
	 * @return y coordinate
	 */
	public int gety() {
		return y;
	} 

	private int x;
	private int y;
	protected static final int width=20;
	protected static final int height=20;
	private static final long serialVersionUID = 11;

}