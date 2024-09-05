public class decimalToBinry {
    public static String  printDecimaltobinary(int decimal){
        String ans = "";
        while(decimal != 0){
            int rem = decimal % 2;
            ans = rem + ans;
            decimal = decimal/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 4;                                                            //              OUTPUT
        System.out.println("Decimal to Binry value is "+printDecimaltobinary(n));   //   Decimal to Binry value is 100
    }
}
