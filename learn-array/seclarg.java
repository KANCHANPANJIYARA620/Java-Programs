public class seclarg {
    // Finding Second Largest Element.
    public static void main(String[] args) {
        int Array[]={2,3,5,7,10,9};
        int max1,max2;
        max1= max2=Array[0];
        for(int i=0;i<Array.length;i++){
            if(max1<Array[i]){
                max2 = max1;
                max1 = Array[i];
            }
            else if(max2<Array[i]){
                max2=Array[i];
            }
        }
        System.out.println(max2);

    }
}
