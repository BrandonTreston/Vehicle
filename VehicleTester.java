
public class VehicleTester {
	public static void main(String [] args){
		RandomGenerator r = new RandomGenerator();
		for(int i = 0; i<10;i++) {
			if(i<=10) {
				r.randomVehicle();
			}
		}
	}
}