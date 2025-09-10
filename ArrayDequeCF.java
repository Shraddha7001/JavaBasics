import java.util.*;

public class ArrayDequeCF {
    public static void main(String[] args) {
        
        ArrayDeque ad1=new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        ad1.add(300);
        System.out.println(ad1);



        ad1.addFirst("Billu");
        System.out.println(ad1);


        ad1.offer(500);
        ad1.offerLast(10);
        ad1.offerFirst(1);
        System.out.println(ad1);


    }
}
