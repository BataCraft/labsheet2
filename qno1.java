//Write a Java program to solve quadratic equations (use if, else if and else)?

import java.util.Scanner;

public class qno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();

        System.out.print("Enter b: ");
        double b = input.nextDouble();

        System.out.print("Enter c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double sqrtDiscriminant = Math.sqrt(Math.abs(discriminant));
        double root1, root2;

        if (discriminant > 0) {
            root1 = (-b + sqrtDiscriminant) / (2 * a);
            root2 = (-b - sqrtDiscriminant) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("Roots are real and same.");
            System.out.println("Root 1 = Root 2 = " + root1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = sqrtDiscriminant / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1 = " + realPart + "+" + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + "-" + imaginaryPart + "i");
        }
    }
}