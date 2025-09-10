import java.util.*;
public class LinkedListCF2 { 
    public static void main(String[] args) {
        

        LinkedList ll1=new LinkedList();


        //Homogeneous data is stored
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(400);
        ll1.add(300);
        System.out.println("LinkedList1 is :: " + ll1);


        System.out.println(ll1.indexOf(300));
        System.out.println(ll1.lastIndexOf(300));
        System.out.println(ll1.getFirst());
        System.out.println(ll1.getLast());



        ll1.push(1000);
        System.out.println(ll1);


        System.out.println(ll1.pop());
    }    

    
}
