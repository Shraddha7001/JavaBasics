import java.util.*;

public class HMandLHM {
    public static void main(String[] args) {
        HashMap hm1=new HashMap();

        hm1.put(01,"Billu");
        hm1.put(02,"Kittu");
        hm1.put(03,"Golu");
        hm1.put(null,"Billu");
        hm1.put(04,null);
        hm1.put(null,null);


        System.out.println(hm1);





        HashMap hm2=new HashMap();

        hm2.put("Rohit","Soni");
        hm2.put("Kishan","Verma");
        hm2.put("Shubham","Singh");
        hm2.put("Shraddha","Yadav");
        hm2.put("Ayush","Jha");
        hm2.put(6,7001);


        System.out.println(hm2);





        LinkedHashMap lhm=new LinkedHashMap();

        lhm.put("Rohit","Soni");
        lhm.put("Kishan","Verma");
        lhm.put("Shubham","Singh");
        lhm.put("Shraddha","Yadav");
        lhm.put("Ayush","Jha");
        lhm.put(6,7001);


        System.out.println(lhm);
    }
}
