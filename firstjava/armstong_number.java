package com.rahul;
import java.util.*;
public class armstong_number {
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        for(int i=a;i<=b;i++){
//            if(isArm(i))
//                System.out.println(i);
//        }
//    }
//    static boolean isArm(int n){
//        int dup=n;
//        int arm=0;
//        while(dup!=0){
//            int d=dup%10;
//            arm=arm+d*d*d;
//            dup/=10;
//        }
//        return n==arm;
//    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int  a = src.nextInt();
        int b = src.nextInt();

        for (int i =a; i<=b; i++){
            if (isArm(i))
                System.out.println(i);
        }


        }
    static boolean isArm (int n){
        int dup = n;
        int arm = 0;
        while (dup!=0){
            int d =dup%10;
            arm = arm*d*d*d;
            dup/=10;
        }
        return n == arm;

    }
}
