import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Document
 */
public class Document {
    int factorial = 1;
    public static String[] sort (String [] arr)
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j].compareToIgnoreCase(arr[j+1]) < 0)
                {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static boolean isAnagram(String a, String b) {
        if(a.length() != b.length())
        {
            return false;
        }
        else{
            String al[] = a.toLowerCase().strip().split("");
            String bl[] = b.toLowerCase().strip().split("");
        
            String sortedA[] = sort(al);
            String sortedB[] = sort(bl);
            Arrays.sort(sortedA);
            
            

            if(Arrays.toString(sortedA).equals(Arrays.toString(sortedB)))
            {
                return true;
            }
            else{
                return false;
            }
                

        }
        // Complete the function
        
        
       

       
        
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("Cat","Tac"));
    }
    public double print(int x,int n)
    {
        
        if(n == 0)
        {
            
            return 1;
        }
        double power = x * print(x, n-1);// x * x pow(n-1) * x pow(n-2) .. 1

        return power;
        
    }
}