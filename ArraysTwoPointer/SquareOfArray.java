package ArraysTwoPointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import ArrayUtil;

public class SquareOfArray {
    

    // create two pointers
    // make an answer array
    // check of the abs of left is > abs right
    // if yes then put the biggest value in the ans array and increase that pointer 
    // check next time while si <=ei
    
    public static void squareArr(int arr[])
    {
        int si =0;
        int ei = arr.length-1;
        int ans[] = new int[arr.length];
        int counter = 0;

        while(si<=ei)
        {
            if(Math.abs(arr[si]) > Math.abs(arr[ei]))
            {
                ans[counter++] = (int) Math.pow(arr[si++], 2);
            }
            else
            {
                ans[counter++] = (int) Math.pow(arr[ei--], 2);
            }
        }
        for(int i=0,j=arr.length-1;i<arr.length;i++,j--)
        {
            arr[i] = ans[j];
        }

    }
    public static void main(String[] args) {
        int arr[] = {-10,-3,-2,1,4,5};
        squareArr(arr);
        ArrayUtil.printArray(arr);
    }
}
