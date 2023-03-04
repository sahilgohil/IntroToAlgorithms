package Recursion;

// find the greatest common divisor between two numbers
public class FindGCD {
    

    // this approach is a bruteforce approach 
    // timecoplextiy = O(n)
    // space complextiy = O(1)
    public static void findGCD(int n1, int n2)
    {
        int length = n1;
        if(n1>n2){
            length = n2;
        }
        for(int i=length;i>0;i--)
        {
            if(n1%i ==0 && n2%i ==0)
            {
                System.out.println("GCD: "+i);
                break;
            }

        }
    }

    // first we are checking the smallest number
    // then we are dividing the largest num with smaller one
    // what ever remainder is left assign the remainder to small and 
    // change the large number to small
    // if remainder == 0 then break the loop and the ans is the small num as GCD
    public static void findGCDLongDivision(int x,int y)
    {
        
        while(x%y != 0)
        {
            int rem = x%y;
            if(rem ==0)
            {
                break;
            }
            x = y;
            y = rem;
        }
        System.out.println("GCD: "+y);
    }



    // in the recursion we are using the Euclid's algorithm
    // here, gcd(x,y) = gcd(y,x%y);
    // we will be using the recursion to solve this problem
    public static int findGCDUsingRecursion(int x, int y)
    {
        if(x%y == 0)
        {
            return x<y ? x: y;
        }
       
        int greCD = findGCDUsingRecursion(y, x%y);
        return greCD;



    }
    public static void main(String[] args) {
        
        findGCD(14, 16);
        findGCDLongDivision(16 , 14);
        System.out.println("GCD RE: "+findGCDUsingRecursion(16, 14));
    }

}
