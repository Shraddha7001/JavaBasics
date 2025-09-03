class student{
    private String name;
    private int age;

    public student()
    {
        System.out.println("Default constructor is called");
        name="Billu";
        age=21;
    }
    public student(String name)
    {
        System.out.println("Parametrized constructor with 1 parameter");
        this.name=name;
        age=22;
    }
    public student(String name,int age)
    {
        System.out.println("Parametrized constructor with 2 constructor");
        this.name=name;
        this.age=age;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}


public class overloading {
    public static void main(String[] args) {
        student st=new student();
        st.disp();
        student st2=new student("Kittu");
        st2.disp();
        student st3=new student("Kittu", 21);
        st3.disp();
    }
}
