package second;

import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number  = input.nextInt();
        System.out.println( "Factor of " +number+ " number is");
        for (int i = 1; i<= number; i++ ){
            if (number % i == 0){

                System.out.println(i+ " ");
            }
        }


    }
}
