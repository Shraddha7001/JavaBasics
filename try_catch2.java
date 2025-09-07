public class try_catch2 {
    public static void main(String[] args) {
        
        int num1=6;
        int num2=0;
        int result1=0;
        int result2=0;
        int values[]={4,5,7,9,5,8};
        String name=null;

        try{
            // result1=num1/num2;
            // result2=num1/name.length();
            System.out.println(values[7]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Denominator should not be 0..."  + e );
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Going out of the limit...." );
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong...." );
        }

        // System.out.println(result1);
        // System.out.println(result2);
        System.out.println("Code was executed sucessfully");
    }
    
}

