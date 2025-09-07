//Create your own exception

// class MyException extends Exception{
//     public MyException()
//     {

//     }
//     public MyException(String msg)
//     {
//         super(msg);
//     }
// }



public class customException {
    public static void main(String[] args) {
        
        int num1=6;
        int num2=-3;
        try{
            if(num2<0)
            {
                // Exception e=new MyException("Negative number");
                Exception e=new ArithmeticException("Negative number..!!!!");
                throw e;
            }
            else{
                int result=num1/num2;
                System.out.println(result);
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid number " + e);
        }
    }
}
