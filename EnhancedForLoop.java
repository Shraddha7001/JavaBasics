public class EnhancedForLoop {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        for(int n:arr1)
        {
            System.out.println(n);
        }
        System.out.println("The length of array1:" + arr1.length);
        int arr2[][]={

            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        System.out.println("Array2:");
        for(int a[] : arr2){
            for(int b:a){
                System.out.print(b + " ");
            }
            System.out.println();
            
    
    
        }
        System.out.println("The length of array2:" + arr2.length);
    }    
}
