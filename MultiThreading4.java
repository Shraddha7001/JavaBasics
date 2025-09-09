class Printing implements Runnable{

    public void run()
    {
        try{
            for(int i=0;i<2;i++)
                {
                System.out.println("Focus is important");
                Thread.sleep(2000);
                }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
    }
}



public class MultiThreading4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Main Thread started");

        Printing p=new Printing();

        Thread t1=new Thread(p);

        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();


        System.out.println("Main thread finished the work");
    }
    
}
