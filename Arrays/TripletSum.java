public class TripletSum {

    public static int tripletTargetSum(int arr[], int target)
    {
        int tripletCount = 0;
        if(arr.length <2)
        {
            return -1;
        }
        for(int i=0; i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if((arr[i]+arr[j]+arr[k]) == target)
                    {
                        tripletCount++;
                    }
                }
            }
        }
        return tripletCount;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,0,4,5};
        System.out.println(tripletTargetSum(arr, 3));
    }
    
}
