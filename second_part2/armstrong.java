//package second_part2;
//import java.util.Scanner;
//public class armstrong {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int dup=n;
//        int sum=0;
//       while(dup!=0){
//           int d=dup%10;
//           sum=sum+d*d*d;
//           dup=dup/10;
//       }
//        System.out.println(sum==n);
//    }
//
//}



package second_part2;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int dup = n;


        while
        (dup!=0){
            int d = dup%10;
          sum=sum+d*d*d;
            dup = dup/10;
        }
        System.out.println(sum == n);

    }
}




