package module1;

public class B extends A {

	B(){
		System.out.println("Constructor B");
	}
	void display() {
		System.out.println("Hello World from B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.display();
	}

}
