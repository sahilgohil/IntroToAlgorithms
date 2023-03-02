public class ArrayUniqueEl {
    public static int uniqueElement(int arr[])
    {
        int unique = -1;
        for(int i=0;i<arr.length;i++)
        {
            
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] !=-1)
                {
                    if(arr[i] == arr[j])
                    {
                        arr[j] = -1;
                        arr[i] = -1;
                    }
                }   
            }
            
        }
        for(int x:arr)
        {
            if(x !=-1)
            {
                unique = x;
            }
        }


        return unique;
    }
    public static void main(String[] args) {
        int arr[] ={2,2,2,3,4,1,2,2,4,1,1,1,2,2,2};
        System.out.println(uniqueElement(arr));
    }
}
