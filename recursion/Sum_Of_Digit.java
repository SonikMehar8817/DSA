public class Sum_Of_Digit {
    public static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        int digit = n%10;
        return digit+sumOfDigit(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(1234));
    }
}