package second_part2;

import java.util.Scanner;

public class _kunal_25 {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int c = 0;

        while
        (i<=n){

            if (i %2 == 0)
            c++;

            i++;
        }
        System.out.println("kunal can go for " + c + "  days in august");
    }
}
