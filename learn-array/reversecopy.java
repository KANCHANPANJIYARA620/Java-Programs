public class ReverseCopy {
        public static void main(String[] args) {
        int A[]={2,3,4,6,8,9,15};
        int B[]=new int[7];
        int n=7;
        for(int i=n-1,j=0;i>=0;i--,j++){
             B[j]=A[i];
        }
        for(int j=0;j<=n-1;j++){
            System.out.println(B[j ]);
        }
    }
}
