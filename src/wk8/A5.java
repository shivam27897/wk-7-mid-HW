package wk8;
/*
Take two int values from user and print greatest among them.
 */
import java.util.Scanner;
public class A5 {
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();
        if (num1 == num2)
            System.out.println ("both are equal");
        else if (num1 > num2)
            System.out.println (num1 + " is greater");
        else
            System.out.println (num2 + " is greater");
    }
}