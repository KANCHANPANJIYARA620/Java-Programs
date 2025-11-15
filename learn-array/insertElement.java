public class insertElement {
    public static void main(String[] args) {

        // Insert Element at index 2.
        int A[]= new int[10]; 
        A[0]=2;A[1]=4;A[2]=8;A[3]=10;A[4]=12;

        int Element=6;
        int index=2;
        int n=5;

        for(int i=n;i>index;i--){
            A[i]=A[i-1];
        }
        A[index]=Element;
        // for(int X:A){
        //     System.out.println(X);
        // }
        for(int i=0;i<=n;i++){
            System.out.println(A[i]);
        }
    }
}
