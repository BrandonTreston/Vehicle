import java.util.Random;
/**
 * Creates a random number generator.
 */
public class RandomGenerator {
	/**
	 * @constructor creates a RandomGenerator object.
	 */
	public RandomGenerator() {
		num_of_outcomes = 100;
		generator = new Random();
		type_of_vehicle = 2;
				
		}
	/**
	 * Generates a random number to give to the x-y coordinates of a vehicle.
	 */
	public int generate() {
	return generator.nextInt(num_of_outcomes);
		}
	/**
	 * uses a coin flip to decide whether to display a Car or a Truck
	 */
	public void randomVehicle() {
		Display d = new Display();
		if (generator.nextInt(type_of_vehicle) == 0) {
			Car c = new Car();
			c.generateRandom();
			d.createFrame();
			d.add(c);
		}
		else {
		Truck t = new Truck();
		t.generateRandom();
		d.createFrame();
		d.add(t);
		}	
	}

	private Random generator;
	private int num_of_outcomes;
	private final int type_of_vehicle;
	}

