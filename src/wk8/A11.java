package wk8;
/*
Write a program to print a string entered by user.
 */
import java.util.Scanner;
public class A11 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
        System.out.print(str);
    }
}

