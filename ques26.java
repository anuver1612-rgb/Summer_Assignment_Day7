import java.util.*;
class q26
{
    public static int Fibonacci(int x)
    {
        if(x==1)
            return 0;
        if(x==2)
            return 1;
        else
            return Fibonacci(x-1)+Fibonacci(x-2);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index number:");
        int n=sc.nextInt();
        int fab=Fibonacci(n);
        System.out.println("FIBONACCI TERM AT "+n+" = "+fab);
    }
}