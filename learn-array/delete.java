public class delete{
    public static void main(String[] args) {
        int A[]= {1,2,4,5,7,9};
        int delete=A[2];
        int index=2;
        int n=6;
        for(int i=index;i<n-1;i++){
            A[i]=A[i+1];
        }
        for(int i=0;i<n-1;i++){
            System.out.println(A[i]);

        }
    }
}