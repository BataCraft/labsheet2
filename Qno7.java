// Write a program in Java to display the multiplication table of a given integer.
import java.util.Scanner;
public class Qno7 {
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(n + "X" + i + "=" + (n*i));
            }
    }
}
