package second;

import java.util.Scanner;

public class peri_rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int width = input.nextInt();
        int peri = 2*(length+width);
        System.out.println(peri);
    }
}
