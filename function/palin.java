package function;

import java.util.Scanner;

public class palin {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();

        boolean isPali = isPali(n);
        System.out.println(isPali);

    }

    static boolean isPali(int n){
        int dup = n;
        int sum = 0;

        while (dup!=0){
            int d = dup%10;
            sum = sum*10+d;
            dup = dup/10;
        }
        if (sum == n)
            return true;
        else
            return false;
    }

}
