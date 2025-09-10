import java.util.*;
public class LinkedListCF { 
    public static void main(String[] args) {
        

        LinkedList ll1=new LinkedList();


        //Homogeneous data is stored
        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        ll1.add(400);
        ll1.add(500);
        System.out.println("LinkedList1 is :: " + ll1);


        LinkedList ll2=new LinkedList();



        //Heterogeneous data is stored
        ll2.add("Java");
        ll2.add("Billu");
        ll2.add(30082004);
        ll2.add("Kittu");
        ll2.add(18112004);
        System.out.println("LinkedList2 is :: " + ll2);


        ll2.add(21);
        System.out.println("Adding value in existing list then LinkedList2 become : : " + ll2);



        LinkedList ll3=new LinkedList();
        
      
        ll3.add(1);
        ll3.add("PW");
        ll3.add(3);
        ll3.add("Java");
        System.out.println("Befor adding collection arrayList3 is :: " + ll3);




       
       
        
        ll3.add(2,"Skills");
        System.out.println("2nd index value is change by other value then the ArrayList3 become :: " + ll3);
        




        System.out.println(ll3.peek());
        System.out.println(ll3);
        System.out.println(ll3.poll());
        System.out.println(ll3);
    }
}
