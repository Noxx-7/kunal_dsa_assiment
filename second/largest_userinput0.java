package second;

import java.sql.SQLOutput;
import java.util.Scanner;

public class largest_userinput0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int x = 0;
        while
        (n!=0){
            x =(x>n)?x:n;

            n = input.nextInt();
        }
        System.out.println(x);
    }
}
