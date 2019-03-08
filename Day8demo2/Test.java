package Day8demo2;

import Day8.Calculator;

public class Test {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int a = c.multiply(10, 2);
		System.out.println("Multiplied value is: " + a);
		
		System.out.print("Multiplied value is: " );
		c.divide(100, 20);
		
	}
}