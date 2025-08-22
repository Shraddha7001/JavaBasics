

public class InDe {
    public static void main(String[] args){

    //Increment and Decrement    
        int a=5;
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);





        
        System.out.println("Value of num1 and num2");
        int num1=5;
        int num2=num1++;
        System.out.println(num1);
        System.out.println(num2);



        System.out.println("Value of num3 and num4");
        int num3=5;
        int num4=++num3;
        System.out.println(num3);
        System.out.println(num4);

        System.out.println("Value of num5 and num6");
        int num5=5;
        int num6=num5++ + ++num5 + --num5;
        System.out.println(num5);
        System.out.println(num6);






        System.out.println("Value of num7 and num8");
        int num7=5;
        int num8= num7++ + ++num7 + ++num7 + num7++ + --num7 + num7--;
        System.out.println(num7);
        System.out.println(num8);






    }
    
}
