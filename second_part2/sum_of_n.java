package second_part2;

import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = 1;
        int x = 0;

        while(n!=0){

            n = input.nextInt();
            x = x+n;




        }
        System.out.println(x);
    }
}
