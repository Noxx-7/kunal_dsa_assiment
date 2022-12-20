package second;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the n ");
        int n = input.nextInt();
         int a = 1;
         int b =1;
         int c;


        System.out.println(a);
        System.out.println(b);

        for (int i = 3; i<=n; i++){
            c = a + b;
            System.out.println(c);

            a = b;
            b = c;
        }
    }
}
