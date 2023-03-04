package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrintArray {

    public static void printArray(int arr[],int idx)
    {
        if(idx == arr.length-1)
        {
            System.out.println(arr[idx]);
            return;
        }

        System.out.println(arr[idx]);
        printArray(arr, idx+1);
    }

    public static int printGlobalMax(int arr[],int idx)
    {
        if(idx == arr.length-1)
        {
            return arr[idx];
        }
        int max = Math.max(arr[idx], printGlobalMax(arr, idx+1));
        return max;

    }
    public static int sumOfArray(int arr[], int idx)
    {
        if(idx == arr.length-1)
        {
            return arr[idx];
        }

        return arr[idx] + sumOfArray(arr, idx+1);
    }

    public static void linearSearchArray(int arr[],int idx, int key)
    {
        if(idx > arr.length -1)
        {
                return;
        }

        if(arr[idx] == key)
        {
            System.out.println("Found: "+key);
            return;
        }
            linearSearchArray(arr, idx+1, key);
    }
    public static void findAllTheIndices(int arr[],int idx, int key )
    {
        if(idx > arr.length -1)
        {
                return;
        }

        if(arr[idx] == key)
        {
            System.out.println("Found at: "+idx);
            
        }
            findAllTheIndices(arr, idx+1, key);

    }
    public static ArrayList<Integer> returnIndicesOf(int arr[],int idx, int key)
    {
        ArrayList <Integer> list = new ArrayList<>();

       
        if(idx > arr.length -1)
        {
            return new ArrayList<Integer>();
        }

        if(arr[idx] == key)
        {            
            list.add(idx);
        }

        ArrayList <Integer> smallList = returnIndicesOf(arr, idx+1, key);

        list.addAll(smallList);
        return list;

    }

    //assuming that the array is ordered
    public static void binarySearchArray(int arr[],int si,int ei,int key)
    {
        if(si >= ei)
        {
            if(arr[si] == key || arr[ei] ==key)
            {
                System.out.println("Found: "+arr[si]);
                return;
            }
            else
            {
                System.out.println("Not found the key");
                return;
            }
        }
        int mid = si +(ei-si)/2;
        if(arr[mid] == key)
        {
            System.out.println("Found: "+arr[mid]);
            return;
        }
        else if(arr[mid] < key)
        {
            si = mid+1;
            binarySearchArray(arr, si, ei, key);
        }
        else{
            ei = mid-1;
            binarySearchArray(arr, si, ei, key);
        } 
    }
    public static boolean isPalindrome(int x) {
        
        List <String> list = Arrays.asList( String.valueOf(x).split(""));
        List <String> list2 = Arrays.asList( String.valueOf(x).split(""));
        Collections.reverse(list2);
        if(list.equals(list2))
        {
            return true;
        }
        return false;
        
    }
    public static int romanToInt(String s) {
        List <String> list = Arrays.asList(s.split(""));
        ArrayList <Integer> num = new ArrayList<>();
        
        for(int i=0;i<list.size();i++)
        {
            if( i< list.size()-1)
            {
                if((list.get(i)+list.get(i+1)).equals("IV"))
                {
                    num.add(4);
                    i++;
                    continue;
                }
                else if((list.get(i)+list.get(i+1)).equals("IX"))
                {
                    num.add(9);
                    i++;
                    continue;
                }
                else if((list.get(i)+list.get(i+1)).equals("XL"))
                {
                    num.add(40);
                    i++;
                    continue;
                }
                else if((list.get(i)+list.get(i+1)).equals("XC"))
                {
                    num.add(90);
                    i++;
                    continue;
                }
                else if((list.get(i)+list.get(i+1)).equals("CD"))
                {
                    num.add(400);
                    i++;
                    continue;
                }
                else if((list.get(i)+list.get(i+1)).equals("CM"))
                {
                    num.add(900);
                    i++;
                    continue;
                }
            }


            switch(list.get(i))
            {
                    case "I":
                    num.add(1);
                    break;
                    case "V":
                    num.add(5);
                    break;
                    case "X":
                    num.add(10);
                    break;
                    case "L":
                    num.add(50);
                    break;
                    case "C":
                    num.add(100);
                    break;
                    case "D":
                    num.add(500);
                    break;
                    case "M":
                    num.add(1000);
                    break;
                
            }
            System.out.println(num);
        }
        int sum = 0;
        for(Integer i:num)
        {
            sum += i;
        }
        return sum;
    }
    

    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        printArray(arr, 0);
        int arr2[] = {1,2,3,4,5,3,2,3,6};
        
        
        System.out.println( printGlobalMax(arr, 0) );
        System.out.println(sumOfArray(arr, 0));
        System.out.println();
        linearSearchArray(arr, 0, 4);
        binarySearchArray(arr, 0, arr.length-1, 6);
        findAllTheIndices(arr2, 0, 3);

        ArrayList <Integer> idxList = returnIndicesOf(arr2, 0, 3);
        System.out.println(idxList);

        System.out.println(isPalindrome(-121));
        System.out.println(romanToInt("LVIII"));
    }
    
}
