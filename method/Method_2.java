public class Method_2 {
    static void  valueCall(int a){
        a++;
        System.out.println(a);
    }
    public static void main(String[] args) {
        int x=4,y=5;
        valueCall (x);
        System.out.println(x);
    }
}
