package Sorting;


/*
 * Merge sort - Divide 'n' Conquer.
 */
public class Merge_Sort {
     static void Msort(int []arr,int s,int e){
        if(s>=e)
           return;
        int mid= s+(e-s)/2;
        Msort(arr, s, mid);
        Msort(arr, mid+1, e);
        merge(arr,s,mid,e);
    }

    static void merge(int [] arr,int m,int mid,int n){
        int left = mid-m+1;
        int right = n-mid;
        int [] L = new int [left];
        int [] R = new int [right];

        for(int i=0;i<left;i++){
            L[i] = arr[m+i];
        }
        for(int i=0;i<right;i++){
            R[i] = arr[mid+1+i];
        }

        int i=0,j=0,k=m;

        while (i<left&&j<right) {
            if(L[i]<R[j]){
                arr[k++] = L[i++];
            }
            else{
                arr[k++] = R[j++];
            }
        }
        while(i<left){
            arr[k++] = L[i++];
        }
        while (j<right) {
            arr[k++]=R[j++];
        }
    }
    public static void main(String[] args) {
        int [] arr = {6,5,8,2,55,33};

        Msort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }

    }

}
