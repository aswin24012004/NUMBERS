public class gcd 
{
        //    static int commonDivisor(int a,int b){
        ////        if(b==0) return a;            recusive Function method
        ////        return commonDivisor(b,a%b);
        //          
        //         return a;
        //    }
    public static void main(String[] args)
     {  
        int a=12,b=20;
        if(b==0) System.out.println(a);
        int min =a<b ? a:b;
        while(min>=2)
        {
        if(a%min==0 && b%min==0)
        {
             System.out.println(min);                     // OUTPUT
             break;               //                           4.
            }
            min--;
        }          
    }
}
