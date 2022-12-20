package com.rahul;

import java.util.Scanner;

public class sixth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float inr = input.nextInt();

        double usd = (int)(0.012d*inr);

        System.out.println(usd);
    }

}
