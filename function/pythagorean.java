package function;

import java.util.Scanner;

public class pythagorean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a  = input.nextInt();
        int b  = input.nextInt();

        int c  = input.nextInt();

        boolean ispy = isPy(a, b, c);
        System.out.println(ispy);


    }

    static boolean isPy(int a, int b, int c){
        return a*a+b*b==c*c;
    }


}
