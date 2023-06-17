// Write a program in Java to display n terms of natural numbers and their sum and average.
import java.util.Scanner;

public class Qno6 {

    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("The first " + n + " natural numbers are: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.println("\nThe sum of the first " + n + " natural numbers is: " + sum);
        System.out.println("The average of the first " + n + " natural numbers is: " + (float) sum / n);
    }
}
