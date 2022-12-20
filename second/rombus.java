package second;

import java.util.Scanner;

public class rombus {
    public static void main(String[] args){
        Scanner input =  new Scanner (System.in);
        int diagonal1 = input.nextInt();
        int diagonal2 = input.nextInt();

        float area = 0.5f*diagonal2*diagonal1;

        System.out.println(area);
    }
}
