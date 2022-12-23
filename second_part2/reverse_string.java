package second_part2;

import java.util.Scanner;

//public class reverse_string {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String n = input.next();
//        String rev="";
//        for(int i=0;i<n.length();i++){
//            rev=n.charAt(i)+rev;
//        }
//        // doubt;
//        System.out.println(rev.equals(n));
//    }
//}
public class reverse_string {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String n = input.next();
        String rev = "";

        for (int i = 0; i<n.length(); i++){
            rev = n.charAt(i)+rev;

        }
        System.out.println(rev + " for reverse");
        System.out.println(rev.equals(n)+ " for palindrom");

    }
}