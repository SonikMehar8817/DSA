public class heap_sort {
    public static void main(String[] args) {
        int [] arr = {6,3,4,6,2,8};
        sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    static void sort(int [] arr){
        int n = arr.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,n,0);
        }
    }
    static void heapify(int [] arr,int n,int i){
        int ele = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<n&&arr[l]>arr[ele]){
            ele = l;
        }
        if(r<n && arr[r]<arr[ele]){
            ele = r;
        }
        if(ele!=i){
            int temp = arr[ele];
            arr[ele] = arr[i];
            arr[i] = temp;
            heapify(arr, n, ele);
        }

    }

}
