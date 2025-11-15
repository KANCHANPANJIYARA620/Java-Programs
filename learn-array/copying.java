public class copying {
    public static void main(String[] args) {
        int A[]= {2,4,5,7,9,19,20};
        int B[]= new  int[7];
        int n=7;
        for(int i=0;i<n;i++){
            B[i]=A[i];
        }
        System.out.println("Element of B is :");
        for(int i=0;i<n;i++){
            System.out.println(B[i]);
        }
    }
}
