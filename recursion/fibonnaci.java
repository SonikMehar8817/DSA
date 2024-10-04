

class fibonnaci {

    public static void main(String[] args) {
        fibo(5);
    }

    static int fibo(int x){
        if(x ==1||x==0)
          return x;
        return fibo(x-1)+fibo(x-2);
    }
}