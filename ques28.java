import java.util.*;
class q28
{
    static int rvs=0;
    public static int reverse(int x)
    {
        if(x==0)
            return 0;
        else
        {
            int r=x%10;
            rvs=rvs*10+r;
            reverse(x/10);
        }
        return rvs;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int rev=reverse(n);
        System.out.println("REVERSE = "+rev);
    }
}