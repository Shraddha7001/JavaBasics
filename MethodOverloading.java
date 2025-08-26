class calc{
    public void show(byte n){
        System.out.println("Byte " + n);
    }
     public void show(short n){
        System.out.println("Short " + n);
    }
     public void show(char n){
        System.out.println("Char " + n);
    }
     public void show(int n){
        System.out.println("int " + n);
    }
}    

public class MethodOverloading {
    public static void main(String[] args) {
        calc obj=new calc();
        byte b=5;
        obj.show(b);
    }
    
}
