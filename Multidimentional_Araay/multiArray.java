package Multidimentional_Araay;
import java.util.*;
public class multiArray {

    static void printArray(int arr[][]){
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        // int [][] arr = new int [3][3];
        // arr[0][1]= 8;
        // System.out.println(arr[0][1]);

        // int [][] arr = {{1,3,4},{5,6,7},{8,9,0}};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row :");
        int r = sc.nextInt();
        System.out.println("Enter the size of the coloum :");
        int c = sc.nextInt();
        System.out.println("Enter "+r*c+" elements :");
        sc.close();
        int [][] arr = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               arr[i][j]=sc.nextInt();
            }
        }

        
        printArray(arr);
    }
}
