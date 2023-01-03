package wk8;
/*
Write a program to print the sum of two numbers entered by user by defining your
own method.
 */
import java.util.Scanner;
public class A10 {
    public static int sum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
    public static void main(String args[])
    {
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        System.out.print("Enter the second number: ");
        y = sc.nextInt();
        sum = sum(x, y);
        System.out.println("The sum of two numbers = " + sum);
    }
}

