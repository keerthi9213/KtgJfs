package basics;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the numerator :-");
		
		int value = scan.nextInt();
		
		System.out.println(value);
		
		System.out.print("Enter the denominator:-");
		
		int den = scan.nextInt();
		
		System.out.println(den);
		
		int result = value / den;
		
		System.out.println("The division result is :-"+result);
		
	}

}
