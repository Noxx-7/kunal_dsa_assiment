package com.rahul;

import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        System.out.println("Enter your number ");

        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        if(i%2==0){
            System.out.println("Its a even number ");
        }
        else {
            System.out.println("Its a odd number");
        }

    }




}
