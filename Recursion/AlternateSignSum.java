package Recursion;


// this class sums the n from 1 to n but with even numbers having alternate signs

public class AlternateSignSum {

    // time complexity = O(n)
    // space complexity  = O(n)


    public static int sumAlternate(int n)
    {
        if(n == 1)
        {
            return n;
        }
        if(n%2 == 0)
        {
            n *=-1;
        }

        int preSum = sumAlternate(Math.abs(n)-1);
        int sum = n + preSum;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumAlternate(5));
    }
    
}
