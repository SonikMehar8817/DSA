public class GCD{

    static int igcd(int n,int m){

        while (n%m!=0) {
            int temp = m;
            m = n%m;
            n = temp;
        }
        return m;
        // int size = 0;
        //   int gcd_val = Integer.MIN_VALUE;
        // if(n>=m){
        //     size = n;
        // }
        // else{
        //     size = m;
        // }
        // for(int i=1;i<size;i++){
        //      if(n%i==0&&m%i==0){
        //         gcd_val = i;
        // }
        // }
        // return gcd_val;
    }

    static int gcd (int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        int n = 17;
        int m = 23;
        System.out.println(gcd(n, m));
    }
}