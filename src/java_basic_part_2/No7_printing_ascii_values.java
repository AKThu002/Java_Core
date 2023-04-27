package java_basic_part_2;

public class No7_printing_ascii_values {

	public static void main(String[] args) {

		int asciiCode = 0;
		while(asciiCode<256) {
			System.out.println((char)asciiCode+" = "+asciiCode);
			asciiCode++;
		}

	}

}
