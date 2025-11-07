
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Key Value :");
        int key=sc.nextInt();

        int A[] = {2,4,6,8,9,7};
         
        for(int i =0;i<A.length;i++){

            if(key==A[i])
            {
                System.out.println("Element Present at index:" +i);
            }
            
        }
        System.out.println("Element Not Found.");

    } 

    
}
