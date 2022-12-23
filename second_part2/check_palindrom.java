package second_part2;

import java.util.Scanner;

public class check_palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner  (System.in);
        int n = input.nextInt();
        int dup = n;
        int sum = 0;

        while(dup!=0){
            int d = dup%10;
            sum = sum*10+d;
            dup = dup/10;
        }
        if (sum == n){
            System.out.println("Its a palindrom "+ sum );

        }
        else {
            System.out.println("Its not a palindrom " + sum);
        }
    }
}
