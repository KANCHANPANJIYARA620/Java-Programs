public class copying {
    public static void main(String[] args) {
        int A[]= {2,4,5,7,9,19,20};
        int B[]= new  int[7];
        int n=7;
        for(int i=0 , j=0;i<n;i++,j++){
            B[j]=A[i];
        }
        System.out.println("Element of B is :");
        for(int j=0;j<n;j++){
            System.out.println(B[j]);
        }
    }
}
