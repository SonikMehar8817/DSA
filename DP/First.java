package DP;

import java.util.Arrays;

/* Greedy algo is use to find the 
Dp:- DP is an algo in which we find the globle optimum solution and usage more iretions to find the best solutions 
Types of DP: 1D,2D,3D,DP on strings
                        Recursoin 
                            |
                        Top-Down DP = Recursion+Memoization
                            |
                        Bottom-Up DP = Tabulation
                            |
                        Space optimization(optional)
                        
- we ofpen use dp when the recursive code gives TLE(time limit acided) becouse in recursive tree 
  we ancounter overlaping (subproblems)* .

  overlaping subproblems:- whenever our problems devided into subproblems and those subproblems occuring once these 
                           our the overlapping subproblem

3 step to solve top down dp:-1.create a DP Array (Fill it with -1)
                             2.put your subproblem value in DP(DP updation)
                             3.use your DP array to get the calculated value

 3 step to solve top down dp:1.
                             
                             3.use your 
*/ 
public class First{
       public int fib(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);

        //bottom up dp

        // if(n==0||n==1) return n;
        // int [] dp = new int[n+1];
        // Arrays.fill(dp,-1);
        // dp[0]=0;
        // dp[1]=1;
        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];

        //optimal solution

        // if(n==0||n==1) return n;
        // int a =0,b=1;
        // for(int i=2;i<=n;i++){
        //     int c = b+a;
        //     a=b;
        //     b=c;
        // }
    }
    public int solve(int n,int []dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=solve(n-1,dp)+solve(n-2,dp);
        return dp[n];
    }
}
    
