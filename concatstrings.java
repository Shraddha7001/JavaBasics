

public class concatstrings {
    public static void main(String[] args) {
        
    
    String s1=new String("billu");

    s1.concat("kittu");
    System.out.println(s1);

    s1=s1.concat("kittu"); 
    System.out.println(s1);



    String s2="pw";
    String s3=s2.concat("skills");
    String s4=new String("java");

    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);





    String s5="Bihar";
    String s6="UP"+"Bihar";
    String s7="Bihar"+"UP"+"Jharkhand";
    String s8=s5+s6+s7;

    System.out.println(s5);
    System.out.println(s6);
    System.out.println(s7);
    System.out.println(s8);




    String str="pw" + 100 + 99;
    System.out.println(str);

   
    }
    
}
