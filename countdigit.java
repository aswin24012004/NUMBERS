public class countdigit {
    public static int printCount(int n){
        int count = 0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {    
        int n = 1234;                                  //                           OUTPUT
        System.out.println("The "+n+" value count is "+printCount(n));  //   The 1234 value count is 4
    }
}
