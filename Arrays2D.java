public class Arrays2D {
    public static void main(String[] args) {
        
        int arr1[][]=new int[3][2];
        arr1[0][0]=1;
        arr1[0][1]=2;
        arr1[1][0]=3;
        arr1[1][1]=4;
        arr1[2][0]=5;
        arr1[2][1]=6;
        System.out.println("Array1:");
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        int arr2[][]={

            {1,2,3,4},
            {5,6,7},
            {8,9}
        };
        System.out.println("Array2:");
        for(int i=0; i<3; i++){
            for(int j=0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
