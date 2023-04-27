package java_basic_part_2;

public class No2_If_else_condition {
    public static void main(String[] args){
        
        int testscore = 76;
        char grade;
        
        if (testscore >= 80){
            grade = 'A';
        } else if (testscore >= 60){
            grade = 'B';
        } else if (testscore >= 40){
            grade = 'C';
        } else if (testscore >= 20){
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade = " + grade);
    }
}
