import java.util.*;
class q27
{
    public static int sod(int x)
    {
        if(x==0)
            return 0;
        else
            return (x%10)+sod(x/10);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int sum=sod(n);
        System.out.println("SUM OF DIGITS = "+sum);
    }
}