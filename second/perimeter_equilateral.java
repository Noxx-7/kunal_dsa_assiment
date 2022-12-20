package second;

import java.util.Scanner;

public class perimeter_equilateral {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int side = input.nextInt();

        int perimeter = 3*side;

        System.out.println(perimeter);
    }


}
