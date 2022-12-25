package function;

import java.util.Scanner;

public class min_max_1 {
     public static void main (String [] args){
         Scanner input = new Scanner(System.in);
         int a = input.nextInt();
         int b = input .nextInt();
         int c = input.nextInt();


         int smallest = smallest(a,b,c);
         int largest = largest(a,b,c);


         System.out.println(smallest);
         System.out.println(largest);
     }

     static int smallest(int a , int b , int c){
         int min = a;
         if (b<min){
             min = b;
         }
         if (c<min){
             min = c;
         }
         return min;

     }

     static int largest(int a, int b , int c){
         int max = a;
         if (b>max){
             max  = b;
         }
         if(c>max){
             max = c;
         }
         return max;
     }

}