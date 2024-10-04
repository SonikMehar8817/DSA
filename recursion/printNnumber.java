import java.util.Scanner;

class printNnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        solve(n);
    }
    static void solve (int n){
        if(n==0)
           return;
        // solve(n-1);          //head recursion
        System.out.println(n);
        solve(n-1);             // tail recursion 
    }
}