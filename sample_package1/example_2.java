package sample_package1;

public class example_2 {
	int a;
	double d;
	
	example_2(){
		a=0;
		d=0;
		System.out.println("Defualt constructor example 2");
	}
	
	example_2(int x){
		a=x;
		d=0;
		System.out.println("para constructor int example 2");
	}
	
	example_2(double x){
		d=x;
		a=0;
		System.out.println("para constructor double example 2");
	}
}
