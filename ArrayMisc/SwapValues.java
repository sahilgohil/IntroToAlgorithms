package ArrayMisc;

public interface SwapValues {

    public static void swapGivenValues(int arr[],int a, int b)
    {
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i] == a )
            {
                arr[i] = b;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {2,3,5,4,2,1};
        int a = 2;
        int b = 8;

        swapGivenValues(arr, a, b);
        for(int i:arr)
        {
            System.out.print(i +" ");
        }
    }
    
}
