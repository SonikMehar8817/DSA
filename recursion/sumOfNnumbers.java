import java.util.Scanner;

public class sumOfNnumbers {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number :");
        int n = sc.nextInt();
        sc.close();
        System.out.println(sumOfAllNnumbers(n));
    }
    static int sumOfAllNnumbers(int n){
        // if(n==0)
        //    return 0;
        // return n+sumOfAllNnumbers(n-1);
        if(n==0)
           return 1;
        return n*sumOfAllNnumbers(n-1);

    }
}