package sample_package1;

public class example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		double d=4.4;
		
		Integer i=5; // Integer is a class - Also known as wrapper class
		
		// accessing the functions of class Integer
		System.out.println(i.compareTo(6)); 
		System.out.println(i.equals(1));
		
		// Accessing the functions of Math library
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.round(d));
		
		// Accessing the methods of Character class
		System.out.println(Character.isLowerCase('c'));
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isDigit('0'));
		System.out.println(Character.toString('c'));
		
		
	}

}
