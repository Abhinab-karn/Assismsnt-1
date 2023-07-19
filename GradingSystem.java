package AssismentOne;

import java.util.Scanner;

public class GradingSystem {
    public void Grade(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int grd= sc.nextInt();


                if (grd<25){
                    System.out.println("Your grade is F");
                } else if (grd<45 && grd>25) {
                    System.out.println("Your grade is E");
                } else if (grd<50 && grd>45) {
                    System.out.println("Your grade is D");
                         } else if (grd<60 && grd>50) {
                    System.out.println("Your grade is C");

                } else if (grd<80 && grd>60) {
                    System.out.println("Your grade is B");
                } else if (grd>80) {
                    System.out.println("Your grade is A");

               }


        }

    }


