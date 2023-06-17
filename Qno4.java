
//Write a Java program to find the number of days in a month?
import java.util.Scanner;

public class Qno4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the months(1-12)");
        int month = sc.nextInt();
        System.out.print("Enter the years");
        int year = sc.nextInt();
        // Checking if the months are valid or not. which given by user.
        if (month < 1 || month > 12) {
            System.out.println("Invilid months");
            return;
        }
        boolean isLeapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); // Checking if the year is a leap
                                                                                      // year

        int dayInMonth = 31;
        switch (month) {
            case 2:
                dayInMonth = isLeapyear ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = 30;
                break;

        }
        System.out.println("There are" + " " + dayInMonth + "Days in " + month + " " + year + ".");

    }
}
