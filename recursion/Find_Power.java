public class Find_Power {
    public static void main(String[] args) {
        System.out.println(pToThePowerQ(2, 2));
    }

    protected static int pToThePowerQ(int p,int q){
        if(q==1) 
          return p;
        return p*pToThePowerQ(p, q-1);
    }
}
