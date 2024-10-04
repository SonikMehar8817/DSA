package DP;
public class CostOfChair {
    public static void main(String[] args) {
        int [] arr = {1,100,1,1,100,1,100,1};
        System.out.println(costOfChair(arr));
    }

    static int costOfChair(int [] arr){
        int a=0,b=0,c=0;
        int x=0,y=0,z=0;

        int k = 0;
        for(int i=0;i<arr.length-2;i++){
            x = arr[i]+arr[i+1];
            y = arr[k]+arr[k+2];
            z += Math.min(x, y);
            k+=2;
        }
        int j = 1;
        for(int i=1;i<arr.length-2;i++){
            a = arr[i]+arr[i+1];
            b = arr[j]+arr[j+2];
            c += Math.min(a, b);
            j+=2;
        }
        return Math.min(z, c);
    }
}
