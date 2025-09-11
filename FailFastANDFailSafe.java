import java.util.*;
import java.util.concurrent.*;


public class FailFastANDFailSafe {
    public static void main(String[] args) {
        

        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);

        //infinite loop is created 
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
            // al.add(100);
        }


        //FailFast
        Iterator itr=al.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
            // al.add(100);
        }

        //Failsafe
        CopyOnWriteArrayList cal=new CopyOnWriteArrayList();
        cal.add(10);
        cal.add(20);
        cal.add(30);
        cal.add(40);
        cal.add(50);
        System.out.println(cal);
        cal.add(100);

    }
}
