public class Adding2D_Array {
    public static void main(String[] args) {
        int A[][]={{1,2,3},{9,8,4},{4,6,8}};
        int B[][]={{3,4,7},{9,4,9},{4,6,9}};
        int C[][]= new int [3][3];
        for(int i=0; i<A.length;i++){
            for(int j=0;j<B.length;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
            for(int X[]:C){
                for(int Y:X){
                    System.out.print(Y+"   ");
                }
                System.out.println(" ");
            }
    }
}
