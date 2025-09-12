import java.util.Arrays;
import java.util.function.Consumer;
import java.util.*;

public class dateANDtime3 {
    public static void main(String[] args) {
        
        List<Integer> list1=Arrays.asList(2,4,6,8,10);
        System.out.println(list1);


        // for(Integer i:list1)
        // {
        //     System.out.println(i);
        // }


        Consumer<Integer> cons=new Consumer<Integer>() 
        {
            @Override
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        };

        list1.forEach(cons);



        Consumer<Integer> cons1=j->System.out.println(j);
        list1.forEach(j->System.out.println(j));

    }
}
