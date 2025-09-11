import java.util.*;
public class Linked_HashSet {
    public static void main(String[] args) {


        HashSet hs=new HashSet();
        hs.add(50);
        hs.add(60);
        hs.add(55);
        hs.add(59);
        hs.add(50);
        hs.add(62);
        hs.add(70);


        System.out.println(hs);





        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(60);
        lhs.add(55);
        lhs.add(82);
        lhs.add(68);
        lhs.add(60);
        lhs.add(90);
        lhs.add(10);

        
        System.out.println(lhs);
    }
}
