package AssismentOne;

import java.util.Scanner;

public class ConvertIntoInt {
    public static void Convert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Double Variable:");
        double dou= sc.nextDouble();

        int a=( int) dou;
        System.out.println("After Converting form Double to Int is:" + a);


    }

}
