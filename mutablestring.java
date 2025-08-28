public class mutablestring  {
    public static void main(String[] args) {



        StringBuffer sb=new StringBuffer("billu");
        System.out.println(sb);
        sb.append("billu");
        System.out.println(sb);





        StringBuilder SB=new StringBuilder("kittu");
        System.out.println(SB);
        SB.append("kittu");
        System.out.println(SB);





        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());
        StringBuilder SB1=new StringBuilder();
        System.out.println(SB1.capacity());
        sb1.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        System.out.println(sb1.charAt(1));
        sb1.setCharAt(1, 'B');
        System.out.println(sb1);








        StringBuilder SB2=new StringBuilder(100);
        System.out.println(SB2.capacity());
        SB2.append("java");
        System.out.println(SB2);
        SB2.trimToSize();
        System.out.println(SB2.capacity());







        StringBuffer sb2=new StringBuffer("java skills");
        System.out.println(sb2);
        System.out.println(sb2.reverse());
        
    }
}
