import javax.swing.JFrame;
/**
 * Creates the display upon which the vehicle will be displayed.
 */
public class Display {
	/**
	 * creates new frame object.
	 */
	public void createFrame() {
	frame = new JFrame();
	frame.setSize(frameWidth, frameHeight);
	frame.setTitle("Vehicle Display");
	//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   not needed.
	frame.setVisible(true);
	}
	/**
	 * @param anObject adds objects to be displayed onto the JFrame.
	 */
	public void add(Vehicle anObject) {
		frame.add(anObject);
	}
	private JFrame frame;
	private final int frameWidth = 300;
	private final int frameHeight = 200;
}
