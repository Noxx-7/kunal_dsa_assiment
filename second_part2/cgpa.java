package second_part2;

import java.util.Scanner;

public class cgpa {

    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        float sem1 = input.nextFloat();
        float sem2 = input.nextFloat();

        float sem3 = input.nextFloat();

        float sem4 = input.nextFloat();

        float cgpa = (sem1+sem2+sem3+sem4)/4.0f;


        System.out.println(cgpa);

    }
}
