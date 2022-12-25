package function;

import java.util.Scanner;

public class add_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1  = input.nextInt();
        int num2 = input.nextInt();

        int sum = sum(num1, num2);
        System.out.println(sum);

    }

    static int sum (int num1, int num2){
        int sum = num1+num2;
        return sum;

    }
}
