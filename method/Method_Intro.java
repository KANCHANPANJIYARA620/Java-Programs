package method;

public class Method_Intro {
    static int max(int x, int y){
        if (x>y){
            return x;
        }
        else
            return y;
    }
    public static void main(String[] args) {
        int a,b,c;
        a=10; b=20;
        c=max(a,b);
        System.out.print(c+" ");
    }
}
