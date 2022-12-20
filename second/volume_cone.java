package second;

import java.util.Scanner;

public class volume_cone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        int height = input.nextInt();

        double  volume = 3.14*radius*radius*height/3;

        System.out.println(volume);
    }
}
