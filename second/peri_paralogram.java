package second;

import java.util.Scanner;

public class peri_paralogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int side = input.nextInt();

        int area = 2*(base+side);
        System.out.println(area);
    }
}
