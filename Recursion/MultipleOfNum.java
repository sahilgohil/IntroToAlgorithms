package Recursion;

public class MultipleOfNum {

    public static void multipleOfNumber(int num,int k)
    {
        if(k==1)
        {
            System.out.println(num);
            return;
        }

        multipleOfNumber(num, k-1);
        System.out.println(num*k);
    }
    public static void main(String[] args) {
        
        multipleOfNumber(10, 10);
    }
    
}
