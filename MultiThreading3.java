import java.util.Scanner;

class MyThread extends Thread{
    public void run()
    {
        String tName=Thread.currentThread().getName();
        if(tName.equals("CALC"))
        {
            calc();
        }
        else{
            importantMessage();
        }
    }




    public void calc()
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
public void importantMessage(){

    
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





public class MultiThreading3 { 
    
    public static void main(String[] args) {
        
        System.out.println("Main Thread started");

        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();

        thread1.setName("CALC");
        thread2.setName("PRINT");


        thread1.start();
        thread2.start();


}
}

