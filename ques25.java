import java.util.*;
class q25
{
    public static int factorial(int x)
    {
        if(x==1)
            return 1;
        return x*factorial(x-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("FACTORIAL = "+fact);
    }
}