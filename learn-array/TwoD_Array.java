public class TwoD_Array {
    public static void main(String[] args) {
        // Creating 2D Array of Size 5*5 
        int A[][]= new int[5][5];

        //OR
        int B[][];
        B=new int[5][5];

        //OR
        int [][]C=new int [5][5];

        //OR
        int[] E[], F;         //Here E is 2D and F is 1D Array.
        E=new int[5][5];
        F=new int[5];  
        
        //OR
        int[] G,H,I;    // Here G,H,I is 1D Array.

        //Creating and Initializing an Array of Size 3*4.
        int X[][]={{1,2,4,5},{2,3,5,7},{4,6,8,10}};

        //Jagged Array.
        int K[][]= new int[3][];
        K[0]=new int[6];
        K[1]=new int[5];
        K[2]=new int[7];

        //Displaying Array X;
        for(int Y[]:X){
            for(int Z:Y){
                System.out.print(Z+" ");
            }
            System.out.println(" ");
        }

    }
}
