/*  Write a Java program that reads a floating-point number and prints "zero" if the number is
zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the
number is less than 1, or "large" if it exceeds 1,000,000. */

public class Qno2 {
    /**
     * @param args
     */
    public static void main(String [] args)
    {
        //  take input form usre
        Scanner sc.new Scanner(System.in);
        System.out.println("Enter your any floating-point");
        float num = sc.nextFloat();
        if(num == 0);
        {
            System.out.println("Zero");
        }
        else if(num > 0);
        {
                System.out.print("Positive");
        }
    }
    if(Math.abs(num)<1){
        System.out.println("Small");
    }
    else if(Math.abs(num)> 1000000);
    {
        System.out.println("Large");
    }
}
