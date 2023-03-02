
// first find the maximum element in the array 
// loop one
// then find the second maximum element in the array
// loop two
// both loops will be different no nested looping

public class SecondMax {
    public static int findSecondMax(int arr[])
    {
        int smax = Integer.MIN_VALUE;
        int preMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > smax)
            {
                smax = arr[i];
            }
            
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < smax && arr[i] > preMax)
            {
                preMax = arr[i];
            }
            
        }


        return preMax;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(findSecondMax(arr));
    }
}
