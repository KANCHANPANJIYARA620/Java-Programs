public class rgtrotate {
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,7,8,9};
        int n=num.length;
        int temp=num[n-1];
        for(int i=n-1;i>0;i--){
            num[i]=num[i-1];
        }
        num[0]=temp;
        for(int X:num){
            System.out.print(X+" ");
        }
    }
}