//time complexity=O(n)
//space cpmplexity=O(1)



public class Missing {
    public static void main(String[] args) {
        

        int arr[]={1,2,4,7,6,5};
        int n=arr.length;


        int sum_natural_num=((n+1)*(n+2))/2;
        int sum=0;


        for(int i=0;i<n;i++)
        {
            sum+=arr[i];

        }
        int missing_elem=0;
        missing_elem=sum_natural_num=sum_natural_num-sum;
        System.out.println("The missing number is :: " + missing_elem);
    }
}
