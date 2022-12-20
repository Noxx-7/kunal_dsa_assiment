package second;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner input =  new Scanner (System.in);
        int height = input.nextInt();
        int base = input.nextInt();

        float area = 0.5f*base*height;

        System.out.println(area);
    }
}
