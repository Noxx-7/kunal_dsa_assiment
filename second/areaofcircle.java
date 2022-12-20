package second;
import java.util.Scanner;

public class areaofcircle {

    public static void main (String[] args){
        Scanner input  =  new Scanner (System.in);
        int radius = input.nextInt();
        double pie = 3.14d;

        double sum = pie*radius*radius;

        System.out.println(sum);
    }
}