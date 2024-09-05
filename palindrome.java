public class palindrome {
    public static String  printPalindrome(int n){
        int value = n;
        int reverse = 0;
        while (n != 0) {
            int digit = n%10;
            reverse = reverse*10 +digit;
            n/=10;
        }
        return value==reverse?"the":"not";
    }
    public static void main(String[] args) {
        int n = 121;                                    //                        OUTPUT
        System.out.println(n+" is "+printPalindrome(n)+" Palindrome.");   //121 is the Palindrome.
    }
}
