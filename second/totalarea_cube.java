package second;

import java.util.Scanner;

public class totalarea_cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();

        int area = 6*side*side;

        System.out.println(area);
    }
}
