interface A {
    void show();
    default void config()
    {
        System.out.println("In config");
    }
    static void place()
    {
        System.out.println("In place");
    }
}


class B implements A{
    public void show()
    {
        System.out.println("in show");
    }
}






public class java8feature {
    public static void main(String[] args) {
        A.place();
        A obj=new B();
        obj.show();
        obj.config();
    }
}

