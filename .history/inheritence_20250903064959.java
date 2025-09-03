class human{
    private String name;
    int age;
    
    human()
    {
        System.out.println("Human class constructor");
    }    
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}    
    class student extends human{
        //Default constructor
        //public student()
        //{
            //super();
        //}
        void disp()
        {
            System.out.println("The age is :" + age);
            // private properties not inherit
            // System.out.println("The name is: " + name); 
        }
    }




public class inheritence {
    public static void main(String[] args) {
        student st=new student();
        st.sleep();
        st.disp();

    }
}
