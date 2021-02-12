package sample_package1;

public class example_4 {

	int a=10, b=20;
	static String company="Apisero"; // using static keyword to save memory | only allocated once
	example_4(){
		a=0;
		b=0;
	}
	
	example_4(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Constructor call");
	}
	
	void display(int a, int b){
		int c=a+b;
		System.out.println("Using params: "+c);
		c = this.a+this.b;
		System.out.println("Using this keyword: "+c);
	}
	
	void displayDetails() {
		System.out.println(a+" "+b+" "+company);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example_4 obj1 = new example_4(10,15);
		obj1.display(5,5);
		example_4 obj2 = new example_4(10,15);
		obj1.displayDetails();
		
	}

}
