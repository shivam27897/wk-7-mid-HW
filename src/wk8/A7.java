package wk8;
/*
Take input of age of 3 people by user and determine oldest and youngest among
them
 */
import java.util.Scanner;
public class A7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of A :");
        int a = sc.nextInt();
        System.out.println("Enter age of B :");
        int b = sc.nextInt();
        System.out.println("Enter age of C :");
        int c = sc.nextInt();
        if (a>b && a>c && b>c){
            System.out.println("A is Oldest & C is Youngest");
        }
        else if (b>a && b>c && a>c) {
            System.out.println("B is oldest & C is Youngest");
        }
        else if (c>a && c>b && a>b) {
            System.out.println("C is oldest & B is Youngest");
        }
        else if (a>b && a>c && c>b) {
            System.out.println("A is oldest & B is Youngest");
        }
        else if (b>a && b>c && c>a) {
            System.out.println("B is oldest & A is Youngest");
        }
        else if (c>a && c>b && b>a) {
            System.out.println("C is oldest & A is Youngest");
        }
        else if (a==b && b==c && c==a) {
            System.out.println("All people have same age");
        }
        else if (a==b && b>c) {
            System.out.println("A,B is oldest & C is Youngest");
        }
        else if (a==c && c>b) {
            System.out.println("A,C is oldest & B is Youngest");
        }
        else if (b==c && c>a) {
            System.out.println("B,C is oldest & A is Youngest");
        }
        else if (a==b && c>a) {
            System.out.println("C is oldest & A,B is Youngest");
        }
        else if (a==c && b>a) {
            System.out.println("B is oldest & A,C is Youngest");
        }
        else if (b==c && a>c) {
            System.out.println("A is oldest & B,C is Youngest");
        }
    }
}