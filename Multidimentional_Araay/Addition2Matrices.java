package Multidimentional_Araay;

public class Addition2Matrices {

      static void printArray(int arr[][]){
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
    }
    static void addToMatrices(int [][]arr,int [][]arr2){
        int [][]arr3 = new int [3][3];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr3[i][j] = arr[i][j]+arr2[i][j];
            }
        }
        printArray(arr);
        System.out.print("+");
        printArray(arr2);
        System.out.println("=");
        printArray(arr3);
    }
    public static void main(String[] args) {
        int [][] arr = {{1,3,4},{5,6,7},{8,9,0}};
        int [][] arr2 = {{1,2,4},{5,0,7},{9,9,0}};
        addToMatrices(arr, arr2);
    }
}
