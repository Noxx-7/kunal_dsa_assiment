package second;

import java.util.Scanner;

public class volume_sphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();

        double volume = 4.0 / 3.0 * 3.14 *radius*radius*radius;

        System.out.println(volume);
    }
}
