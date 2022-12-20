package second;

import java.util.Scanner;

public class volume_pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baselength = input.nextInt();
        int basewidth = input.nextInt();
        int pyramidheight = input.nextInt();

        double volume = (baselength*basewidth*pyramidheight)/3;

        System.out.println(volume);
    }
}
