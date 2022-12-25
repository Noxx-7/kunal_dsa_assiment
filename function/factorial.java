package function;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int isFact = isFact(n);
        System.out.println(isFact);


    }

    static int isFact(int n){
        int fact = 1;
        for (int i = 1; i<= n; i++  )

            fact = fact*i;
    return fact;
    }

}
