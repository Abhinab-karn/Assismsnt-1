package AssismentOne;

import java.util.Scanner;

public class AreaOfRectangle {

        public void Area(){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Length:");
                double len= sc.nextDouble();
                System.out.println("Enter the Breadth:");
                double bre= sc.nextDouble();
                double are=len*bre;

                System.out.println("The area of Rectangle is:" + are);
        }

}


