import java.util.Scanner;

public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
        sc.close();
    }
    static void solve (int n){
        if(n==0)
           return;
        System.out.println(n%2);    
        solve(n/2);
    }
}
