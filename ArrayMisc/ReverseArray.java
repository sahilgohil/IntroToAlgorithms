package ArrayMisc;

public class ReverseArray {
    
    public static int[] reverse(int arr[])
    {
        int reversedArray[] = new int[arr.length];

        for(int i=arr.length,j=0;i>0;i--,j++)
        {
            reversedArray[j] = arr[i-1];
        }
        return reversedArray;

    }

    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int rev[] = reverse(arr);

        for(int i:rev)
        {
            System.out.print(i+" ");
        }

    }

}
