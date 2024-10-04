import java.util.ArrayList;
public class Rat_In_A_Maze {
    public static ArrayList<String> FindPath(int [][]mat){
        ArrayList<String> ans = new ArrayList<>();
        solve(mat,mat.length,0,0,ans,"");
        return ans;
    }
    public static void solve(int [][] mat,int n,int i,int j,ArrayList<String> ans,String temp){
        if(i==n||j==n||i==-1||j==-1||mat[i][j]==0){
            return;
        }
        if(i==n-1&&j==n-1){
            ans.add(temp);                 
            return;
        }
        mat[i][j] = 0;
        solve(mat, n, i+1, j, ans, temp+"D");
        solve(mat, n, i-1, j, ans, temp+"U");
        solve(mat, n, i, j-1, ans, temp+"L");
        solve(mat, n, i, j+1, ans, temp+"R");
        mat[i][j]=1;

    }
    public static void main(String[] args) {
        int [][] arr = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        System.out.println(FindPath(arr));
    }
}
