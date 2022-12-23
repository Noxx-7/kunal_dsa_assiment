package second_part2;

import java.util.Scanner;

public class hcf {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int hcf = 1;
        for (int  i = 1; i<=num1 || i<=num2; i++){
            if (num1% i ==0 && num2 %i == 0)
                hcf = i;

        }
        System.out.println(hcf);


    }
}
