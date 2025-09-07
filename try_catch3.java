class Demo{
    public void a() throws Exception
    //When b not want to handle the exception
    {
        // try{
        b();
        // }
        //     catch(Exception e)
        // {
        //     System.out.println("Erorr......" + e.getMessage());
        // }
    }
    public void b() throws Exception
    {
        int num1=0;
        int num2=0;

        //When a not want to handle the exception
        // try{
            int result=num1/num2;
            System.out.println(result);
        // }
        // catch(Exception e)
        // {
        //     System.out.println("Error...." + e.getMessage());
        // }
    }
}





public class try_catch3 {
    public static void main(String[] args) {
        Demo obj=new Demo();
        //When both a and b not want to handle the exception
        try{
            obj.a();
        }
        catch(Exception e)
        {
            System.out.println("Erorr...." + e.getMessage());
        }
    }
}
