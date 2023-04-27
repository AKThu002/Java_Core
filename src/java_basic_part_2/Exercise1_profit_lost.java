package java_basic_part_2;

public class Exercise1_profit_lost {
    public static void main(String[] args){
        
        int costPrice = 1000;
        int sellPrice = 1500;
        int net = sellPrice - costPrice;
        
        if(net>0){
            System.out.println("You profit "+ net);
        }else if(net<0){
            System.out.println("You lost "+ Math.abs(net));
        }else {
            System.out.println("No profit or lost");
        }
    }
}
