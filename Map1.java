
import java.util.Map.*;
import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        
        Map map=new HashMap();

        map.put(1,"Rohit Soni");
        map.put(2,"Kishan Verma");
        map.put(3,"Shubham Singh");
        map.put(4,"Shraddha Yadav");
        map.put(5,"Ayush Jha");

        System.out.println(map);


        System.out.println(map.get(5));


        Set keySet=map.keySet();
        Iterator itr1=keySet.iterator();
        System.out.println("Set of all keys");
        while(itr1.hasNext())
        {
            Integer key=(Integer)itr1.next();
            System.out.println(key);
            //System.out.println(itr1.next());
        }



        Collection values=map.values();
        Iterator itr2=values.iterator();
        System.out.println("Collection of all values" );
        while(itr2.hasNext())
        {
            String names=(String)itr2.next();
            System.out.println(names);
            //System.out.println(itr2.next());
        }



        Set entrySet=map.entrySet();
        Iterator itr3=entrySet.iterator();
        System.out.println("Set of keys : Values");
        while(itr3.hasNext())
        {
            Map.Entry data=(Entry)itr3.next();
            System.out.println(data.getKey() + ":" + data.getValue());
            // System.out.println( itr3.next());
        }
    }
}
