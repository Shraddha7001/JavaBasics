public class PalindromicArray{
    public static void main(String[] args) {
        
        int arr[]={1,2,3,2,1};
        int n=arr.length;
        int flag=0;

        System.out.println("Before :: " + arr);


        for(int i=0;i<n/2;i++)
        {
            if(arr[i] != arr[n-i-1])
            {
                flag=1;
                System.out.println("It is not a palindromic array...!!");
                System.out.println("After :: " + arr);
                break;
            }
        }
        if (flag==0)
        {
            System.out.println("It is  a palindromic array");
            System.out.println("After :: " + arr);
        }
    }
}