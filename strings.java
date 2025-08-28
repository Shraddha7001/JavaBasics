public class strings  {
    public static void main(String[] args) {
        String s1="billu";
        String s2="billu";
        System.out.println(s1==s2);

        String s3=new String("kittu");
        String s4=new String("Kittu");
        System.out.println(s3==s4);




        String s5="meow_meow";
        String s6=new String("meow_meow");

        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));




        String s7="meow";
        String s8="meow";
        String s9="MEOW";

        System.out.println(s7==s8);
        System.out.println(s7==s9);
        System.out.println(s7.equals(s8));
        System.out.println(s7.equals(s9));



        String s10="BILLU";
        String s11=new String("BILLU");
        String s12=new String("BILLU");
        
        System.out.println(s10==s11);
        System.out.println(s10==s12);
        System.out.println(s10.equals(s11));
        System.out.println(s10.equals(s12));

        
    }
}
