import java.util.*;

public class Collection {
    public static void main(String[] args) {
        
        ArrayList al1=new ArrayList();

        al1.add(10);
        al1.add(90);
        al1.add(100);
        al1.add(60);
        al1.add(40);
        al1.add(20);

        System.out.println("Original al1 :: " + al1);

        Collections.sort(al1);
        System.out.println("Sorted al1 :: " + al1);



        ArrayList<String> al2=new ArrayList<String>();

        al2.add("Rohit");
        al2.add("Shubham");
        al2.add("Kishan");
        al2.add("Raj");
        al2.add("Ayush");
        al2.add("Shraddha");

        System.out.println("Original al2 :: " + al2);

        Collections.sort(al2);
        System.out.println("Sorted al2 :: " + al2);

        ArrayList<Integer> al3=new ArrayList<Integer>();

        al3.add(50);
        al3.add(20);
        al3.add(60);
        al3.add(70);
        al3.add(10);
        al3.add(30);
        al3.add(20);
        al3.add(20);

        System.out.println("Original al3 :: " + al3);

        Collections.sort(al3);
        
        System.out.println("Sorted al3 :: " + al3);
        
        


        int index=Collections.binarySearch(al3,20);
        System.out.println("Index is :: " + index);

        Collections.rotate(al3, 3);
        System.out.println("After rotation :: " + al3);


        Collections.shuffle(al3);
        System.out.println("After shuffle" + al3);

        System.out.println(Collections.frequency(al3, 20));

    }
}
