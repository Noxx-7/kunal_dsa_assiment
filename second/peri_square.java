package second;

import java.util.Scanner;

public class peri_square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side = input.nextInt();
        int peri = 4*side;

        System.out.println(peri);
    }
}
