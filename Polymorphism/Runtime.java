
public class Bike {
	
	public void run() {
		System.out.println("Bike running");
	}
	
	public void walk() {
		System.out.println("Bike walking");
	}

}

// ---------------------------------------------------------------------

public class Pulsar extends Bike{

	@Override
	public void run() {
		System.out.println("Pulsar running");
	}
	
}

// ---------------------------------------------------------------------

public static void main(String[] args) {
		
		Bike b = new Bike();
		Pulsar p = new Pulsar();
		b.run();
		p.run();
		p.walk();
		System.out.println("****");
		Bike c = new Pulsar();
		c.run();
		c.walk();	
		
	}

