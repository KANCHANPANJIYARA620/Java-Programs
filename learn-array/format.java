public class format{
    public static void main(String[] args) {
        // Ways to Represent 1D Array
        int A[]= new int[5];

        int B[]={1,2,3,4,5};

        int C[];
        C= new int[5];

        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
        for(int X: B){
            System.out.println(X);
        }
    }

}