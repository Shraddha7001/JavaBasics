interface Computer{
    void compilecode();
}


class Laptop implements Computer{
    public void compilecode()
    {
        System.out.println("You got 5 errors");
    }
}


class Desktop implements Computer{
    public void compilecode()
    {
        System.out.println("It is faster than laptop");
    }
}



class Developer{
    public void buildApp(Computer obj)
    {
        System.out.println("Building App");
        obj.compilecode();
    }
}



public class Main{
    public static void main(String[] args) {
        Computer obj=new Desktop();
        Computer obj1=new Laptop();
        Developer dev=new Developer();
        dev.buildApp(obj);
        dev.buildApp(obj1);
    }
}