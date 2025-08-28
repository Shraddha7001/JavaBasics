public class reversingOfString  {
    public static void main(String[] args) {


        String str1="pwjava";
        String str2=" ";
        for(int i=str1.length()-1; i>=0; i--){
            str2=str2+str1.charAt(i);
        }
        System.out.println("Before Reversing 1: " + str1);
        System.out.println("After Reversing 1: " + str2);



        String str3="pw skill java";
        String str4=" ";
        String arr[]=str3.split(" ");
        for (int i = arr.length-1; i >=0; i--) {
            str4=str4+arr[i]+" ";
        }
        System.out.println("Before reversing 3:" + str3);
        System.out.println("After reversing 3:" + str4);




        String str5="pw skills java";
        String str6=" ";
        for(int i=str5.length()-1; i>=0; i--){
        str6=str6+str5.charAt(i);
        }
        System.out.println("Before reversing 5:" + str5);
        System.out.println("After reversing 5:" + str6);





        
        String str7="pw skills java";
        String str8=" ";
        String arr1[]=str7.split(" ");
        for(String element:arr1){
            for(int i=element.length()-1; i>=0; i--){
               str8=str8+element.charAt(i);
        }
        str8=str8+" ";
        }
        System.out.println("Before reversing 7:" + str7);
        System.out.println("After reversing 7:" + str8);


    }
}
