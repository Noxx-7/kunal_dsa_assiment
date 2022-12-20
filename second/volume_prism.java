package second;

import java.util.Scanner;

public class volume_prism {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        int height = input.nextInt();
        int volume = base*height;
        System.out.println(volume);
    }
}
