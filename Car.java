import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * creates a Car using methods and fields inherited from superclass Vehicle.
 */
public class Car extends Vehicle{
	/**
	 * @constructor creates a Car object
	 */
	public Car() {
		super();
		x2 = getx()+15;
		y2 = gety()-30;
	}
/**
 * @param g Graphics object, casted to Graphics2D creates a car from two Rectangles and two circles.
 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawRect(x2, y2, width2, height2);
		super.paintComponent(g2);
	}
	/**
	 * @override Vehicle.generateRandom()
	 * generates a random location to display a car.
	 */
	public void generateRandom() {
		super.generateRandom();
		x2 = getx()+15;		//When super.generateRandom() is called, the original x and y coordinates are changed.
		y2 = gety()-30;  	//These updates are made to accommodate for that change.
		
	}
	private static final long serialVersionUID = 1L;
	private  int x2;
	private  int y2;
	private static final int height2 = 10;
	private static final int width2 = 40;
}