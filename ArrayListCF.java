import java.util.*;
public class ArrayListCF { 
    public static void main(String[] args) {
        

        ArrayList al1=new ArrayList();


        //Homogeneous data is stored
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(500);
        System.out.println("ArrayList1 is :: " + al1);


        ArrayList al2=new ArrayList();



        //Heterogeneous data is stored
        al2.add("Java");
        al2.add("Billu");
        al2.add(30082004);
        al2.add("Kittu");
        al2.add(18112004);
        System.out.println("ArrayList2 is :: " + al2);


        al2.add(21);
        System.out.println("Adding value in existing list then ArrayList2 become : : " + al2);



        ArrayList al3=new ArrayList();
        
      
        al3.add(1);
        al3.add("PW");
        al3.add(3);
        al3.add("Java");
        System.out.println("Befor adding collection arrayList3 is :: " + al3);




       
        al3.addAll(al2);
        System.out.println("After adding collection ArrayList3 is :: " + al3);

        
        al3.add(2,"Skills");
        System.out.println("2nd index value is change by other value then the ArrayList3 become :: " + al3);
        

    }
}
