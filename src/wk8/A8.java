package wk8;
/*
A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
 */
import java.util.Scanner;
public class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 100;
        System.out.println("Number of class held is " + a);
        System.out.print("enter attended number of class :");
        int ac = sc.nextInt();
        int per = (ac * 100 / a);
        System.out.println("Attendance is " + per +" %");
        if (per >= 75 ) {
            System.out.println("Student is allowed to sit in Exam");
        } else {
            System.out.println("Student is NOT allowed to sit in Exam");
        }
    }
}