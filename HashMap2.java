import java.util.*;
import java.util.Map.*;

class student{
    private String name;
    private int age;
    private String city;

    public student(String name,int age,String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString()
    {
        return name + " " + age + " " + city ;
    }
}

public class HashMap2 {
    public static void main(String[] args) {
        

        student st1=new student("Rohit Soni",22,"Asansol");
        student st2=new student("Kishan Verma",24,"Ramgard");
        student st3=new student("Shubham Singh",22,"Hazaribagh");
        student st4=new student("Shraddha Yadav",21,"Kolkata");


        Map map=new HashMap();
        map.put(1,st1);
        map.put(2,st2);
        map.put(3,st3);
        map.put(4,st4);

        System.out.println(map);
        

        Set set=map.entrySet();
        Iterator itr=set.iterator();

        while(itr.hasNext())
        {
            Map.Entry data=(Entry)itr.next();
            System.out.println(data.getKey() + " : " + data.getValue());
        }
    }
}
