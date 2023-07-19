package AssismentOne;

import java.util.Scanner;

public class SquareOfNumber {
    public static void Square(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        double num= sc.nextDouble();
        double sqr= num*num;
        System.out.println("The square of a number is:" + sqr);

    }
}
