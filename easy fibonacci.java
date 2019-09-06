import java.util.Scanner;

public class Fibonacci {
    static long fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    
    public static void main (String args[])
    {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        System.out.println(fib(n));
    }
}
