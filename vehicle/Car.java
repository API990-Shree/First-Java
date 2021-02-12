package vehicle;

public class Car extends Vehicle {

	void start() {
		System.out.println("wroom wroom");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();
		obj.start();
	}

}
