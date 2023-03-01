public class Peak2D {
    
    public static void main(String[] args) {
        
        int[][] arr = {
            {1, 2, 3, 4},
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},

        };

        // for(int i[]:arr)
        // {
        //     for(int j:i )
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        int middle = arr[0].length/2;
        int globalMax = -1;
        int globalMaxRow = -1;
        boolean isPeakFound = false;

        while(!isPeakFound)
        {
            for(int i=0;i<arr[0].length;i++)
                {
                    if(arr[i][middle]>= globalMax)
                    {
                        globalMax = arr[i][middle];
                        globalMaxRow = i;
                    }
                }
                if(middle == arr[0].length-1)
                {
                    break;

                }
                else{
                    if(arr[globalMaxRow][middle] <= arr[globalMaxRow][middle-1])
                        {
                            globalMax = arr[globalMaxRow][middle-1];
                            if(middle == arr[0].length-1)
                            {
                                break;
                            }
                            else{
                                middle++;
                            }
                        }
                    if(arr[globalMaxRow][middle] <= arr[globalMaxRow][middle+1])
                    {
                        globalMax = arr[globalMaxRow][middle+1];
                        if(middle == arr[0].length-1)
                        {
                            break;
                        }
                        else{
                            middle++;
                        }
                    }

                }

                
                

        }
        System.out.println(globalMax);
        



    }

}
