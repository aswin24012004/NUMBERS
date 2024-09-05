public class fibonacci {
    public static void fib(int n){
        int a = 0,b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            int t =a+b;
            a = b;
            b = t;
        }
    }
    public static void main(String[] args) {
        int n = 5;        //            OUTPUT
        fib(n);                   //     0 1 1 2 3 
    }
}
