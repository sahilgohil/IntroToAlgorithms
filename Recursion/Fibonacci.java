package Recursion;

public class Fibonacci {

    public static void printFibonacci(int a, int b, int n)
    {
        if(n == 0)
        {
            return;
        }

        int next = a + b;
         a = b;
         b = next;

        
        System.out.print(next+" ");
        printFibonacci(a, b, n-1);
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        printFibonacci(0, 1, 5);
    }
    
}
