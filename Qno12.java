/*Write a program for creating a menu driven program in java. The program creates a menu
for area of different shapes and asks the user to calculate the area for shape.
c . circle
s. square
r. rectangle
t . triangle */

import java.util.Scanner;

public class Qno12 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Press 1 for Circel:");
        System.out.println("Press 2 for area of rectangle:");
        System.out.println("Press 3 for area of triangle:");
        System.out.println("Press 4 for area of Squre:");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice)
        {

        
        case 1:
        double r,area;
        System.out.print("enter radius");
        r=sc.nextDouble();
        area=(3.14*r*r);
        System.out.print("Area of circle is" + area);
        break;
        case 2:
        double l,b;
        System.out.print("enter length breadth ");
        l=sc.nextDouble();
        b=sc.nextDouble();
        area=l*b;
        System.out.print("Area of Rectangle is" + area);
        break;
        case 3:
        double h;
        System.out.print("enter base height ");
        b=sc.nextDouble();
        h=sc.nextDouble();
        area=0.5*(h*b);
        System.out.print("Area of Triangle is " + area );
        break;
        case 4:
        int side;
        System.out.print("enter number sides :");
        side=sc.nextInt();
        area = side * side;
        System.out.print("Area of Square is "+ area);
        default:
        System.out.println("Invalid Choice!!!");
        
        }
    }
}
