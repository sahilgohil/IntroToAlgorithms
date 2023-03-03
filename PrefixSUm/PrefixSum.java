package PrefixSUm;



public class PrefixSum {

    public static int[] findPrefixSum(int arr[])
    {
        // loop through 1 to <length
        // arr[i] = prevale+ arr[i];


        for(int i=1;i<arr.length;i++)
        {
            arr[i] = arr[i-1]+arr[i];

        }
        return arr;
    }
    public static int[] findSuffixSum(int arr[])
    {
        // loop from beck to 0
        // put arr[i] = arr[i] + arr[i+1];
        for(int i=arr.length-2;i>=0;i--)
        {
            arr[i] = arr[i] + arr[i+1];
        }
        return arr;
    }
    public static int preFixSumInRange(int arr[],int si,int ei)
    {
        // passing the prefixedsum array
        // then getting the value at the end of the given index
        // subtracting it from the value of the starting index-1
        // returning the sum
        int sum = arr[ei] - arr[si-1];
        return sum;
    }
    public static boolean isDivisibleTwoSum(int arr[])
    {
        boolean isDiv = false;
        int preFix[] = findPrefixSum(arr.clone());
        int suffix[] = findSuffixSum(arr.clone());
        for(int i=0;i<arr.length-1;i++)
        {
            if(preFix[i] == suffix[i+1])
            {
                isDiv = true;
                eqlDivideArray(arr.clone(),i);
                break;
            }
        }
        return isDiv;


    }
    public static void eqlDivideArray(int arr[],int div)
    {
        int firstHalf[] = new int[div+1];
        int secondHalf[] = new int[arr.length-div-1];
        

        for(int i=0;i<firstHalf.length;i++)
        {
            firstHalf[i] = arr[i];
        }
        for(int i=0,j=div+1;i<secondHalf.length;i++,j++){
            secondHalf[i] = arr[j];
        }
        ArrayUtil.printArray(firstHalf);
        System.out.println();
        ArrayUtil.printArray(secondHalf);
    }

    public static void main(String[] args) {
        
        int arr[] = {5,3,2,6,3,1};
        boolean isDiv = isDivisibleTwoSum(arr);
        System.out.println(isDiv ? "Yes" : "No");

        
    }
}
