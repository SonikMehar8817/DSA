package Multidimentional_Araay;
class Rotating_Matrix{
    static void rotatingMatrix(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
           
        }
        for(int i=0;i<matrix.length;i++){
             int a=0,b=matrix.length-1;
            while(a<b){
                int val = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = val;
                a++;
                b--;
            }
        }

        
        
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        rotatingMatrix(arr);
    }
}