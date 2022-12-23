package second_part2;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int lcm =   (num1>num2)? num1:num2;

        while (true){
            if (lcm % num1 ==0 && lcm %num2 == 0)
            {System.out.println(num1 + " "+ num2 +" "+ lcm);
            break;}
            lcm ++;
        }

    }
}
