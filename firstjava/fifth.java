package com.rahul;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        int b  = input.nextInt();

        if(a>b){
            System.out.println( a + " is the bigger number ");
        }
        else{
            System.out.println(b + " is the bigger number ");
        }
    }

}
