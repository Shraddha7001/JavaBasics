import java.util.*;

public class IteratorANDListIterator {
    public static void main(String[] args) {
        

        ArrayList al=new ArrayList();

        al.add(50);
        al.add(60);
        al.add(85);
        al.add(55);
        al.add(50);
        al.add(66);

        System.out.println(al);



        //Fetching of data using the concept of loops

        //For Loop

        for(int i=0;i<al.size();i++)
        {
            Object o=al.get(i);
            System.out.println(o);

        }
        System.out.println("**************************************");

        // For Each Loop

        for(Object o1:al)
        {
            System.out.println(o1);
        }

        System.out.println("*******************************************");

        // Iterator

        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
            Integer j=(Integer)itr.next();
            System.out.println(j);
        }




        System.out.println("***************************************************");


        // ListIterator

        ListIterator litr=al.listIterator(al.size());
        while(litr.hasPrevious())
        {
            Integer k=(Integer)litr.previous();
            System.out.println(k);
        }
    }
}
