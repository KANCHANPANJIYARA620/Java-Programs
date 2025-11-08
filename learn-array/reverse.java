public class reverse {
    public static void main(String[] args) {
        // Left Rotation of Array
        int num[]={2,4,5,3,1,7,8,9,5,6,7};
        int tem=num[0];
        for(int i=1;i<num.length;i++){
            num[i-1]=num[i];
        }
        num[num.length-1]=tem;
        for(int X:num){
            System.out.print(X +" ");
        }
    }
}
