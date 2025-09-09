import java.util.Scanner;


class calc extends Thread{


    public void run()
    {
        System.out.println("Calculation Task Started....");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter 1st number = ");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number = ");
        int num2=sc.nextInt();

        int result=num1+num2;

        System.out.println(result);
        System.out.println("Calculation Task Ended.....");

        System.out.println("*************************************************");

    }   
}


class Message extends Thread{

    public void run()
    {
        System.out.println("Displaying important message task");
        try {
            for(int i=0;i<3;i++)
            {
                System.out.println("Focus is important to master skills...!!");
                // Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Some problem");
        }


        System.out.println("Displaying important message task ended");
    }

}





public class MultiThreading { 
    
    public static void main(String[] args) {
        
        System.out.println("Main Thread started");

        calc t1=new calc();
        Message t2=new Message();


        t1.start();
        t2.start();


        //start behaving like a single thread

        // t1.run();
        // t2.run()
    }
}
