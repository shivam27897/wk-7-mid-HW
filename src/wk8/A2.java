package wk8;
/*
Print multiplication table of 24, 50 and 29 using loop
 */
public class A2 {
    public static void main(String[] args) {

        int a=24,b=50,c=29;
        for(int i=1; i <= 10; i++)
        {
            System.out.println(a+" * "+i+" = "+a*i);
        }
        System.out.println("");
        for(int i=1; i <= 10; i++)
        {
            System.out.println(b+" * "+i+" = "+b*i);
        }
        System.out.println("");
        for(int i=1; i <= 10; i++)
        {
            System.out.println(c+" * "+i+" = "+c*i);
        }
    }
}