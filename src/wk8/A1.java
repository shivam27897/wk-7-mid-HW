package wk8;

/*
Take 10 integers from keyboard using loop and print their average value on the
screen.
 */
import java.util.Scanner;
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Enter a Value: ");
            sum = sum + sc.nextInt();
        }
        double avg = sum / 10;

        System.out.println("Average is " + avg);

    }
}