package second_part2;

import java.util.Scanner;

public class cal_distance_two_point {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int y1 = input.nextInt();
        int y2 = input.nextInt();

        double dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println(dis);



    }

}
