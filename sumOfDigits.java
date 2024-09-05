public class sumOfDigits {
    public static int printSumOfDigits(int n){
        int sum = 0;
        while (n != 0) {
            int digit = n%10;
            sum += digit;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println("The "+n+"  count sum  is "+printSumOfDigits(n));    //       OUTPUT
                                      //                                       The 1234  count sum  is 10
    }
}
