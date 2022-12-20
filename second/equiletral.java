package second;

import java.util.Scanner;

public class equiletral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();

         double root = Math.sqrt(3);
         double num = 4;

         double sum = root/num*side*side;

        System.out.println(sum);

    }
}
