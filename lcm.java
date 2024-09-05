public class lcm {
    public static int printlcm(int x, int y){
        int lcm = 0;
        int max = x>y?x:y;
        while (true) {
            if ((max%x==0)&&(max%y==0)) {
                lcm = max;
                break;
            }
            max++;
        }
        return lcm;
    }
    public static void main(String[] args) {
        int x=12,y=15;                                                      //          OUTPUT
        System.out.println("The LCM is "+x+" and "+y+" is "+printlcm(x,y));       //The LCM is 12 and 15 is 60
    }
}
