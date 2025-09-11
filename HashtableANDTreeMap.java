import java.util.*;

public class HashtableANDTreeMap {
    public static void main(String[] args) {
        

        Hashtable ht=new Hashtable();


        ht.put(1,"Rohit");
        ht.put(2,"Kishan");
        ht.put(3,"Shubham");
        ht.put(4,"Shraddha");

        System.out.println(ht);


        ht.putIfAbsent(5,"Raj");
        System.out.println(ht);


        TreeMap tm=new TreeMap();

        tm.put(1,"Rohit");
        tm.put(2,"Kishan");
        tm.put(3,"Shubham");
        tm.put(4,"Shraddha");

        System.out.println(tm);



    }
}
