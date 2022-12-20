package second;

import java.util.Scanner;

public class curverd_area_cylinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        int radius = input.nextInt();
        double area = 2*3.14*radius*height;

        System.out.println(area);

    }
}
