package second_part2;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        double pow = Math.pow(a,b);

        System.out.println(pow);

    }
}
