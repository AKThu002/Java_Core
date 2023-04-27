package java_basic_part_1;

public class No3_VariableDeclaration2 {
    
    public static void main(String args[]) {
        
        // integers
        byte largestByte = Byte.MAX_VALUE;
        short largestShort = Short.MAX_VALUE;
        int largestInteger = Integer.MAX_VALUE;
        long largestLong = Long.MAX_VALUE;
        
        // real numbers
        float largestFloat = Float.MAX_VALUE;
        double largestDouble = Double.MAX_VALUE;
        
        // Display them all.
        System.out.println("largest byte value is " + largestByte + ".");
        System.out.println("largest short value is " + largestShort + ".");
        System.out.println("largest integer value is " + largestInteger + ".");
        System.out.println("largest long value is " + largestLong + ".");
        System.out.println("largest float value is " + largestFloat + ".");
        System.out.println("largest double value is " + largestDouble + ".");
    }
    
}
