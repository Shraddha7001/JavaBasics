public class Arrays {
    public static void main(String[] args) {
        
        int arr1[]={5,7,8,9,6 };
        System.out.println("The values in array1");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);

    

        int arr2[]={ 9,5,8,7,6,4 };
        System.out.println("The values in array2");
        for(int i=0; i<5; i++){
            
            System.out.println(arr2[i]);
        }


        int arr3[]=new int[5];
        arr3[0]=33;
        arr3[1]=10;
        arr3[2]=77;
        arr3[3]=66;
        arr3[4]=55;
        System.out.println("The values in array3:");
        for(int j=0; j<5; j++){
            
            System.out.println(arr3[j] );
        }
        String names[]={"Billu", "Kittu","Golu", "Kissu"};
        System.out.println("The names that string holds:");
        for(int k=0; k<4; k++){
            System.out.println(names[k]);
        }
    }    
}
