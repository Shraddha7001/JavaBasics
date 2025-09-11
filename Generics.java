import java.util.*;


class Student1{
    private String names;
    private int id;
}

class Employee1{
    private String names;
    private int id;
}

public class Generics {
    public static void main(String[] args) {
        
        Student1 str1=new Student1();
        Student1 str2=new Student1();

        Employee1 emp1=new Employee1();


        ArrayList<Student1> al=new ArrayList<Student1>();

        al.add(str1);
        al.add(str2);

        //Gives Compile time error
        // al.add(e);



        System.out.println(al);
    }
}
