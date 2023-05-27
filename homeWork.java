package castingVariables;

import java.util.Scanner;

public class homeWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        float number1 = sc.nextFloat();

        System.out.print("Enter your second number: ");
        float number2 = sc.nextFloat();


        float n = number1 * number2;
        System.out.println ((int) (n));

        sc.close ();

    }
}
