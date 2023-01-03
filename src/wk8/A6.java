package wk8;
/*
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
 */
import java.util.Scanner;
public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks :");
        int i = sc.nextInt();
        if (i>=80){
            System.out.println("Grade = A");
        } else if (i>=60 && i<80) {
            System.out.println("Grade = B");
        }else if (i>=50 && i<60) {
            System.out.println("Grade = C");
        }else if (i>=45 && i<50) {
            System.out.println("Grade = D");
        } else if (i>=25 && i<45) {
            System.out.println("Grade = E");
        }else if (i<25) {
            System.out.println("Grade = F");
        }
    }
}