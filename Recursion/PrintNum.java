package Recursion;

public class PrintNum {

    public static void print(int n)
    {
        if(n == 0)
        {
            return;
        }

        print(n-1);
        System.out.print(n + " "); // ptinting 1-5
    }

    public static void main(String[] args) {
        print(5);
    }
    
}
