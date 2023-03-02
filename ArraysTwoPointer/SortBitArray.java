package ArraysTwoPointer;

// sort an array which has only 0 and 1 as elements.
// steps
// 1. count the number of 0's in the array
// 2. replace the 0 to count-1 indexes of array with the 0's
// 3. replace count to < length indexes of array with the 1's

public class SortBitArray {
    public static void sortBitArray(int arr[])
    {
        int count = 0;

        for(int i:arr)
        {
            if(i == 0)
            {
                count++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(i<count)
            {
                arr[i] = 0;
            }
            else
            {
                arr[i] = 1;
            }
        }

    }

    public static void main(String[] args) {
        
        int arr[] = {0,1,0,1,0,1};
        sortBitArray(arr);
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
