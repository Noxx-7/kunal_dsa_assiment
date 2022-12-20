package second;

import java.util.Scanner;

public class circle {
    public static void main (String[] args){
        Scanner input  =  new Scanner (System.in);
        int radius = input.nextInt();
        double pie = 3.14d;

         double sum = 2*pie*radius;

        System.out.println(sum);
}}
