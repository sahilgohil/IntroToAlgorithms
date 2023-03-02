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
        
        int arr[] = {0,1,0,1,0,1,0,0,0,1,1,1,0};
        System.out.println("Before Sorting");
        printArray(arr);
        System.out.println("After sorting");
        sortBitArrayTwoPointer(arr);
        printArray(arr);


    }

    // select the left pointer element
    // select the right pointer element
    // if left pointer element is > right then swap
    // do it while left < right
    public static void sortBitArrayTwoPointer(int arr[])
    {
        int left = 0;
        int right = arr.length-1;
        
        while(left <= right)
        {
            if(arr[left] ==1 && arr[right] ==0)
            {
                swap(arr, left, right);
            }
            if(arr[left] == 0)
            {
                left++;
            }
            if(arr[right] == 1){
                right--;

            }
            
        }

    }
    public static void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void printArray(int arr[])
    {
        for(int i:arr)
        {
            System.out.printf("%d ",i);
        }
    }
}
