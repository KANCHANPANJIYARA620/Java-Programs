public class IncreasingSize {
    public static void main(String[] args) {
        int A[]={2,3,4,5,7,8};
        int B[]= new int[2*A.length];
        int n=6;
        for(int i=0;i<n;i++){
            B[i]=A[i];
        }
        A=B;
        System.out.println("Length of A is :"+ A.length);
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }

    }
}
