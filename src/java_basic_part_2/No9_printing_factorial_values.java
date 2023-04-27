package java_basic_part_2;

import java.util.Scanner;

public class No9_printing_factorial_values {

	public static void main(String[] args) {
		
		System.out.print("Please input the number to calculate factorial: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int numberB = number;
		int result = 1;
		while(number>0) {
			result *= number;
			number--;
		}
		System.out.println("Factorial result of number "+numberB+" is = "+result);

	}

}
