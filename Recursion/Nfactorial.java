package Recursion;

public class Nfactorial {
    public static int factorialN(int n)
    {
        if( n == 1)
        {
            return 1;
        }

        int mul = n * factorialN(n-1);
        return mul;
    }
    
    
    public static void main(String[] args) {
        System.out.println(factorialN(4));
    }
}
