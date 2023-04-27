package java_basic_part_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class No8_using_system_in {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Please input some string values: ");
		char[] a = br.readLine().toCharArray();
		System.out.println("Input Character Count: "+ a.length);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input some string values: ");
		String value = scan.nextLine();
		a = value.toCharArray();
		System.out.println("Input Character Count: "+a.length);
		br.close();
		scan.close();
	}

}
