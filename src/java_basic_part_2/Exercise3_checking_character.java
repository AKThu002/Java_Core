package java_basic_part_2;

import java.util.Scanner;

public class Exercise3_checking_character {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter a character: ");
        char character = scanner.next().charAt(0);
        int ascii = character;
        String result;
        
        if(ascii>=65 && ascii<=90){
            result = "a capital letter";
        } else if(ascii>=97 && ascii<=122){
            result = "a small letter";
        } else if(ascii>=48 && ascii<=57){
            result = "a digit";
        } else {
            result = "a special symbol";
        }
        
        System.out.println("You entered "+result);
    }
}
