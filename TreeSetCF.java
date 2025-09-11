import java.util.*;
public class TreeSetCF{
    public static void main(String[] args) {
        
        TreeSet ts=new TreeSet();


        ts.add(55);
        ts.add(10);
        ts.add(65);
        ts.add(75);
        ts.add(55);
        ts.add(95);
        ts.add(11);
        ts.add(35);

        System.out.println(ts);


        System.out.println(ts.higher(55));
        System.out.println(ts.lower(55));


        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(40));


        System.out.println(ts.ceiling(55));
        System.out.println(ts.floor(55));
    }
}