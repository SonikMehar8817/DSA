package Sorting;

import java.util.Scanner;

/*
 * Quick Sort:- it is use pivot and partitioning approach.
 *                       or
 * defination :-quick sort is a sorting algorithm the usage the pivot and partitioning approach
 *              to sort an array the pivot can we either last or first or any random elemnt of the
 *              array
 *  
 * algorithm:-1. set the pivot element(last or first) the initialiazed two pointer i and j where
 *               i = j-1 
 *            2. campaire the jth element and the pivot element 
 *                   2.1 if element is greater the pivot j++ .
 *                   2.2 else increment i and swap ith and jth element.
 *            3 repeat step two until j reaches pivot.
 *            4 do i++ and swap ith and pivot element.
 *            5 repeat step one to four until the array  become sorted
 */
public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of a array :");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter Array elements :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        quickSort(arr,0,n-1);
        for(int i:arr){
            System.out.println(i);
        }
    }

    static void quickSort(int []arr,int s,int e){
        if(s>=e){
            return;
        }
        int pivot = Partition(arr,s,e);
        quickSort(arr, s, pivot-1);
        quickSort(arr, pivot+1, e);
    }

    static int Partition(int [] arr,int s,int e){
        int pivot = arr[e];
        int i = s-1;
        for(int j=s;j<e;j++){
           
            if(arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[e];
        arr[e] = temp;
        return i;
    }
}
