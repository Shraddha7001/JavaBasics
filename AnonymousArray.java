class calc {
    public int add(int arr[])
    {
        int result =0;
        for(int n: arr) 
        {
            result=result+n;
        }
        return result;
    }
}
public class AnonymousArray {
    public static void main(String[] args) {
        calc obj=new calc();
        int arr[]={1,2,3,4,5,6,7,8,9};
        int result=obj.add(arr);
        System.out.println(result);
    }
}
