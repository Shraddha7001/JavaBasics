import java.util.*;

class Gen<T>
{
    T obj;

    public Gen(T obj)
    {
        this.obj=obj;
    }

    public T getObj()
    {
        return obj;
    }

    void disp()
    {
        System.out.println("The type of data is :: " + obj.getClass().getName());
    }
}


public class Generics2 {
    public static void main(String[] args) {
        

        Gen<Integer> g=new Gen<Integer>(100);


        g.disp();
        System.out.println(g.getObj());

        System.out.println("*************************************");


        Gen<String> g2=new Gen<String>("Billu");


        g2.disp();
        System.out.println(g2.getObj());
    }
}
