package second_part2;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int year = input.nextInt();

        if (year%4==0){
            System.out.println("leap");
        }
        else {
            System.out.println("no leap");
        }
    }
}
