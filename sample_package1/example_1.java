package sample_package1;

public class example_1 extends example_2{
	int a;
	String name;
	
	example_1(){
		System.out.println("Welcome");
	}
	example_1(String n){
		name = n;
		System.out.println("Welcome "+name);
	}
	
	example_1 (int n){
		a = n;
		System.out.println("a = "+a);
	}
	
	void display() {
		System.out.println("Sample text display");
	}
	
	public static void main(String[] args) {
		// creating object
		example_1 obj1 = new example_1(); // default constructor
		example_1 obj2 = new example_1("Shree"); // parameterized constructor
		example_1 obj3 = new example_1(10); // parameterized constructor
		
		// for loop
		for(int i=0;i<obj3.a;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		obj1.display();
		
		// Using the extended class
		example_2 obj_1 = new example_2(5.5); // A obj = new A()
		example_2 obj_2 = new example_1(5); // A obj = new B()
		
		
		
		
		
	}

}
