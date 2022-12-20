package second;

import java.util.Scanner;

public class subtract_theSum_add_thesum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum =0;
        int sub = 1;
        while(n>0){
            int rem = n%10;
             sum = rem+sum;
             sub =rem*sub;
             n= n/10;



        }

        int summ = sub-sum;

        System.out.println(summ);
    }

}
