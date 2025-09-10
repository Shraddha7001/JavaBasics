import java.util.*;


public class ArrayListCF2 {
    public static void main(String[] args) {
        
        ArrayList al1=new ArrayList();

        al1.ensureCapacity(10);
        
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(500);
        System.out.println("ArrayList1 is :: " + al1);

        System.out.println(al1.indexOf(500));


        al1.trimToSize();
        System.out.println(al1.size());

        al1.clear();
        System.out.println((al1));

        List al=new ArrayList();
        
        al.add(1000);
        System.out.println(al);

    }
}
