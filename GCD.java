package AssismentOne;

import java.util.Scanner;

public class GCD {
    public void Factor() {
        //----->>In this case loop will be execute till the user has taken input upto that time
       Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the Two Number:");
//        int n1=sc.nextInt();
//        int n2= sc.nextInt();
//        int g=0;
//        for (int i = 1; i <=n1 ; i++) {
//            if(n1%i==0 && n2%i==0)
//                g=i;
//        }
//        System.out.println(g);

        //------>In this case loop will be executed 2 time only--->>
 //Scanner sc= new Scanner(System.in);
        System.out.println("Enter The two number");       //500 & 600
        int n3= sc.nextInt();                            //500
        int n4= sc.nextInt();                           //600
        while (n3%n4!=0){                              //500 % 600 ! == 0 --> True it will execute    // 600 % 100 !==0--->True it wont execute it will terminate and  directly print n2
            int r=n3%n4;                              //r = 500 % 600 == 100 --
            n3=n4;                                   //n1=600
            n4=r;                                   //n2=100

        }
        System.out.println(n4);

    }


}
