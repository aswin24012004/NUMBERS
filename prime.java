public class prime {
    public static String primes(int n){
        if(n<=1) return "Not";
        for (int i = 2; i < n; i++) {
            if(n%i == 0) return "Not";
        }
        return "the";
    }
    public static void main(String[] args) {
        int n = 5;                                  //     OUTPUT
        System.out.println(n+" is "+primes(n)+" Prime");    //5 is the Prime
    }
}
