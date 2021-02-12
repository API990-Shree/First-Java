package sample_package1;

public class string_example {

	public static void main(String[] args) {
		String s = "Mango";
		
		// finding length
		System.out.println("length of "+ s+" = "+s.length());
		// finding index of
		System.out.println("Index of n is " + s.indexOf('n'));
		
		String s2 = "love ";
		
		// method 1 to concatenate
		System.out.println(s2+s);

		// method 2 to concatenate
		s2 = s2.concat(s);
		System.out.println(s2);
		
		// Removes preceding and trailing empty spaces
		s2 = " "+s2+" ";
		System.out.println(s2.trim());
		System.out.println(s2.strip());

	}

}
