package com.rahul;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        char op = input.next().charAt(0);


        int ans = 0 ;
        if (op == '+'){
            ans = num1+num2;

        } else if (op == '-') {
            ans = num1-num2;

        }
        else if (op == '/') {
            ans = num1/num2;

        }else if (op == '*') {
            ans = num1*num2;

        }

        System.out.println("result  " + ans);




    }
}
