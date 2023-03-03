package MultiDimenArrays;

import java.util.HashMap;
import java.util.Map;


public class SumOfRectangle {

    public static void sumRecRange(int a[][],int r1,int l1, int r2, int l2)
    {
        int sum = 0;
        for(int i=r1;i<r2;i++)//rows
        {
            for(int j=l1;j<l2;j++) //colms
            {
                sum += a[i][j];
            }
        
        }
        System.out.println(sum);
    }

    public static int largestSubString(String s)
    {

        Map <Integer,String> stringMap = new HashMap<>();
        Map <Integer,String> charMap = new HashMap<>();

        int count = 0;
        int strCount = 0;
        String sub = "";

        for(int i=0;i<s.length();i++)
        { 
            charMap.put(count++, String.valueOf(s.charAt(i)));

            for(int j=i+1;j<s.length();j++)
            {
                if(!charMap.containsValue(String.valueOf(s.charAt(j))))
                {
                    charMap.put(count++, String.valueOf(s.charAt(j)));
                }
                else{
                    for(String str:charMap.values())
                    {
                        sub+=str;
                    }
                    stringMap.put(strCount++, sub);
                    charMap.clear();
                    break;
                }
            }
            count=0;
            sub ="";
        }
        if(charMap.size() >0)
        {
            for(String str:charMap.values())
                    {
                        sub+=str;
                    }
                    stringMap.put(strCount++, sub);
                    charMap.clear();
        }

        int larg= 0;
        for(String str:stringMap.values())
        {
            if(str.length() >larg)
            {
                larg = str.length();
            }
        }

        return larg;
    }

    
    public static void main(String[] args) {
        // int arr[][]={
        //             {1,1,1,1,1},
        //             {1,1,1,1,1}
        // };
        // sumRecRange(arr, 0, 1, 2, 4);

        System.out.println("Length of longest substring: "+largestSubString(" "));
        
    }
    
}
