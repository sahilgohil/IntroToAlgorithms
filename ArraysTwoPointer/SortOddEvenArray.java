package ArraysTwoPointer;

public class SortOddEvenArray {
    
    // put two pointers in the array
    // if the first is the even and end is the odd then swap
    // if the first is odd then increment the counter of first
    // if the last is the even then increment the counter of last

    public static void sortOddEven(int arr[])
    {
        int si = 0;
        int ei = arr.length-1;

        while(si<ei)
        {
            if(arr[si] % 2 == 0 && arr[ei] % 2 !=0)
            {
                SortBitArray.swap(arr, si, ei);
            }
            if(arr[si] %2 != 0)
            {
                si++;
            }
            if(arr[ei] %2 ==0)
            {
                ei--;
            }
        }

    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        sortOddEven(arr);
        SortBitArray.printArray(arr);

    }

}
