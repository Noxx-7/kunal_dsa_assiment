package function;

import java.util.Scanner;

public class vote {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        int vote = vote(age);

    }

    static int vote(int age) {
        if (age >= 18)
            System.out.println(age + " you can vote");
        if (age < 18)

            System.out.println(age + " You can't vote");

   return age;
    }

}
