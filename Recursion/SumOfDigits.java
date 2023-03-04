package Recursion;

// to find the sum of the digits using the recursion
// small function = sum = number%10 will give us the last digit
// for recursion put new parameter as number/10 to get the digits without the last digit
// int sum = n%10 + re(n/10);
//return sum

public class SumOfDigits {

    public static int findSumOfDigits(int n)
    {
        if(n >= 0 && n<=9)
        {
            return n;
        }


        int sum = (n%10) + findSumOfDigits(n/10);
        return sum;


    }
    public static void main(String[] args) {
        System.out.println(findSumOfDigits(123));
    }
    
}
