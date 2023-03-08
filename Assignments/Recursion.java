package Assignments;

public class Recursion {

    public static int sum(int n, int m)
    {
        if(m<=1)
        {
            return ((n*(n+1))/2);
        }
        int sums  = sum(sum(n, m-1),1);
        return sums;
    }
    public static void main(String[] args) {
        System.out.println(sum(4, 1));
    }
    
}
