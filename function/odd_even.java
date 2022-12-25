package function;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();


         int even = even(n);


    }
    static int even(int n ){
        if (n %2 == 0){

            System.out.println(n + " Its a even");
        }

     if (n%2 !=0){
         System.out.println(n+ " no even its a odd");
     }
        return n;
    }


}
