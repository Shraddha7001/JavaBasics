import java.util.InputMismatchException;
import java.util.Scanner;

public class try_finally {
    public static void main(String[] args) {
        
        int num=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number = ");
        try{
            num=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Enter a valid number....!!!");
        }
        finally{
            sc.close();
            System.out.println("Resourse Closed");
        }
        System.out.println("Number is...." + num);
    }
}
