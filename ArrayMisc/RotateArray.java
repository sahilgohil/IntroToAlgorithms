package ArrayMisc;

public class RotateArray {

    public static int[] rotate(int arr[], int k){


        int newArr[] = new int[arr.length];
        int n = arr.length;
        k = k%n;
        int j =0;

        for(int i=n-k;i<n;i++)
        {
            newArr[j++] = arr[i];
        }
        for(int i=0;i<n-k;i++)
        {
            newArr[j++] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int rotation[] = rotate(arr, 4);

        for(int i:rotation)
        {
            System.out.print(i+" ");
        }

    }
    
}
