package java_basic_part_2;

public class Exercise2_steel_grading {
    public static void main(String[] args){
        
        int hardness = 60;
        double carbon = 0.6;
        int tensile = 5800;
        int grade;
        
        if(hardness>50 && carbon<0.7 && tensile>5600){
            grade = 10;
        } else if(hardness>50 && carbon<0.7){
            grade = 9;
        } else if(carbon<0.7 && tensile>5600){
            grade = 8;
        } else if(hardness>50 && tensile>5600){
            grade = 7;
        } else if(hardness>50 || carbon<0.7 || tensile>5600){
            grade = 6;
        } else {
            grade = 5;
        }
        
        System.out.println("This is a Grade "+ grade +" steel!");
    }
}
