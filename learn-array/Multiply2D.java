public class Multiply2D {
    public static void main(String[] args) {
        int A[][]={{2,4,5},{5,6,8},{9,3,5}};
        int B[][]={{3,4,6},{8,9,4},{9,8,2}};
        int C[][]=new int [3][3];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                C[i][j]=0;
                for(int k=0;k<C.length;k++){
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
        for(int X[]:C){
            for(int Y:X){
                System.out.print(Y+"  ");
            }
                System.out.println(" ");
        }
    }
}
