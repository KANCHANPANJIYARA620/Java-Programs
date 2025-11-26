public class MethodReverseNo {
    public static int[]  reverse(int B[]) {
        int temp=B[0];
        int n=B.length;
        for(int i = 1;i<n;i++){
            B[i-1]=B[i];
        }
        B[n-1]=temp;

        return B;
    }
    public static void main(String[] args) {
        int A[]={4,6,7,9,7};
        int result[]=reverse(A);
        for(int x:result)
        System.out.println(x);
    }
}
