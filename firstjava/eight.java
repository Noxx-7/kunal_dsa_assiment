package com.rahul;

public class eight {
    public static boolean palindrome (int x){
        String nox = String.valueOf(x);

        int start  = 0;
        int end = nox.length()-1;

        while (start<end){
            if (nox.charAt(start++) != nox.charAt(end--))
                return false;
        }
        return true;
    }
}
