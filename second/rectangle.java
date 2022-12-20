package second;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int length = input.nextInt();
        int breath = input.nextInt();

        int area = length*breath;
        System.out.println(area);
    }
}
