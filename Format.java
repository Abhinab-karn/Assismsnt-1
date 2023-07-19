package AssismentOne;

import java.util.Scanner;

public class Format {
    public void formatting(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Name");
        String name= sc.nextLine();
        System.out.println("Roll");
        int roll= sc.nextInt();
        sc.nextLine();
        System.out.println("Intrest");
        Scanner sce=new Scanner(System.in);

        String intrest=sce.nextLine();



        System.out.print("Hey, My Name is " + name +  " and My roll number is: " + roll + " and My intrest is on " + intrest);


    }
}
