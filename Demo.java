class calc{
    public int add(int n1,int n2){
        int result=n1+n2;
        return result;
    }
    public int add(int n1,int n2,int n3){
        int result=n1+n2+n3;
        return result;
    }
    public double add(double n1,double n2){
        double result=n1+n2;
        return result;
    }
}

public class Demo {
    public static void main(String[] args) {
        calc obj=new calc();
        int result1=obj.add(5, 6);
        int result2=obj.add(4,5,6);
        double result3=obj.add(5.5,4.5);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    
}
