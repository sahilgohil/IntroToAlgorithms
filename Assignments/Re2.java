package Assignments;

public class Re2 {
    public static int isArmstring(int num,int len)
    {
         if(num/10 == 0)
         {

            return (int) Math.pow(num%10, len);
         }
         
         int n = (int) Math.pow(num%10, len);
         int sum = n + isArmstring(num/10, len);
         return sum;
    }

    public static void isPrimeNum(int num,int len)
    {
        if(len<=0)
        {
            System.out.println("Is a Prime Num");
            return;
        }
        if(num !=len && len !=1 && num % len == 0)
        {
            System.out.println("Not a prime Num");
            return;
        }
        isPrimeNum(num, len-1);
    }
    public static void main(String[] args) {
        int sum = 134;
        int l = String.valueOf(sum).length();
        int reSum = isArmstring(sum, l);
        System.out.println(reSum == sum ? "Armstrong":"No Armstrong");

        int n =4;
        isPrimeNum(n, n);
    }
    
}
