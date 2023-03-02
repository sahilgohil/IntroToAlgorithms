public class FirstRepeatingValue {

    public static int firstRepeatValue(int arr[])
    {
        int repeatValue = -1;

        for(int i=0;i<arr.length;i++)
        {
            if(repeatValue == -1)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i] == arr[j])
                    {
                        repeatValue = arr[i];
                        break;
                    }
                }
            }
            
        }

        return repeatValue;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,3,4,5};
        System.out.println(firstRepeatValue(arr));

    }
    
}
