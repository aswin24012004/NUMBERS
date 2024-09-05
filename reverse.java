public class reverse {
    public static int printReverse(int n){
        int reverse = 0;
        while (n != 0) {
            int digit = n%10;
            reverse = reverse*10 +digit;
            n/=10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int n = 123;               //                 OUTPUT
        System.out.println(printReverse(n));          //321
    }
}
