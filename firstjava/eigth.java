package com.rahul;
import java.util.Scanner;
public class eigth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        String rev="";
        for(int i=0;i<st.length();i++){
            rev=st.charAt(i)+rev;
        }
        if(rev.equals(st))
            System.out.print("The string "+st+" is palindrome.");
        else System.out.println("The string "+st+" is not palindrome");
    }
}
//class eigth{
//    public static void main(String args[]){
//        Scanner sc=new Scanner(System.in);
//        String st=sc.next();
//        if(isPal(st))
//            System.out.println(st+" is palindrome.");
//        else System.out.println(st+" is not palindrome.");
//    }
//    static boolean isPal(String st){
//        int i=0,j=st.length()-1;
//        while(i<=j){
//            if(st.charAt(i)!=st.charAt(j))
//                return false;
//            i++;
//            j--;
//        }
//        return true;
//    }
//}

//class palindromme_multiple_solution {
//    public static boolean palindrome (int x){
//        String nox = String.valueOf(x);
//
//        int start  = 0;
//        int end = nox.length()-1;
//
//        while (start<end){
//            if (nox.charAt(start++) != nox.charAt(end--))
//                return false;
//        }
//        return true;
//    }
//}