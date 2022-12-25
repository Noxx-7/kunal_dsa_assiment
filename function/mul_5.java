package function;

import java.util.Scanner;

public class mul_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1  = input.nextInt();
        int num2 = input.nextInt();

        int mul = mul(num1, num2);
        System.out.println(mul);

    }

    static int mul (int num1, int num2){
        int mul = num1*num2;
        return mul;

    }
}
