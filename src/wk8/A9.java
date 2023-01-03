package wk8;

import java.util.Scanner;

/*
Modify the above question to allow student to sit if he/she has medical cause. Ask
user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly
 */
public class A9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 100;
        System.out.println("Number of class held is " + a);
        System.out.print("enter attended number of class :");
        int ac = sc.nextInt();
        int per = (ac * 100 / a);
        System.out.println("Attendance is " + per + " %");
        if (per < 75) {
            System.out.println("Student has any medical cause ?");
            System.out.print("Y:Yes");
            System.out.println("    N:No");
            System.out.println("Enter Y or N");
            char c = sc.next().charAt(0);
            switch (c) {
                case 'Y':
                    System.out.println("Student is allowed to sit in Exam");
                    break;
                case 'N':
                    System.out.println("Student is NOT allowed to sit in Exam");
                    break;
                default:
                    System.out.println("Invalid");
            }
        } else System.out.println("Student is allowed to sit in Exam");
    }
}