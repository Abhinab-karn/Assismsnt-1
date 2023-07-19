package AssismentOne;

import java.util.Scanner;

public class PerimeterOfTriangle {
    public static void Perimeter(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length1:");
        double L1= sc.nextDouble();
        System.out.println("Enter the Lenght2:");
        double L2=sc.nextDouble();
        System.out.println("Enter the Length3:");
        double L3= sc.nextDouble();
        double peri=  L1*L2*L3;
        System.out.println("The perimeter of Triangle is:" + peri);
    }
}
