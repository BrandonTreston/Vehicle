import java.awt.Graphics;
import java.awt.Graphics2D;
/**
 * creates a Truck using methods and fields inherited from superclass Vehicle.
 */
public class Truck extends Vehicle{
	/**
	 * @constructor creates a Truck object.
	 */
	public Truck() {
		super();
		x2 = getx()+85;
		y2 = gety()+40;
	}
/**
 * @param g Graphics object, casted to Graphics2D creates a Truck from two Rectangles and two circles.
 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawRect(x2, y2, width2, height2);
		g2.drawRect(x2-50, y2, 40, height2);
		g2.drawOval(x2, y2+height2, width, height);
		g2.drawOval(x2+130, y2+height2, width, height);
		g2.drawOval(x2+100, y2+height2, width, height);
		g2.drawOval(x2+30, y2+height2, width, height);
		g2.drawOval(x2-40, y2+height2, width, height);

	}
	/**
	 * @override Vehicle.generateRandom()
	 * generates a random location to display a truck
	 */
	public void generateRandom() {
		RandomGenerator r = new RandomGenerator();
		x2 = r.generate();
		y2 = r.generate();	
		
	}
	private static final long serialVersionUID = 1L;
	private  int x2;
	private  int y2;
	private static final int height2 = 50;
	private static final int width2 = 150;
}

