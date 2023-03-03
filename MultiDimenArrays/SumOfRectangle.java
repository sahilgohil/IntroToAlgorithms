package MultiDimenArrays;



public class SumOfRectangle {

    public static void sumRecRange(int a[][],int r1,int l1, int r2, int l2)
    {
        int sum = 0;
        for(int i=r1;i<r2;i++)//rows
        {
            for(int j=l1;j<l2;j++) //colms
            {
                sum += a[i][j];
            }
        
        }
        System.out.println(sum);
    }

    // in the below method first making the prefix of each row,
    // when the query of getting the sum of the range will come then
    // the columns will be if starting!=0  ending - starting-1
    // meaning sum += arr[rowsI][ending] - arr[rowsI][starting-1]

    public static void subRecRangePrefix(int a[][],int r1,int l1, int r2, int l2)
    {
        
        int sum = 0;
        prefixSumMatrix(a);
        for(int i=r1;i<=r2;i++) //rows
        {
            if(l1==0)
            {
                sum += a[i][l2];
            }
            else
            {
                sum += a[i][l2] - a[i][l1-1];
            }
        }
        System.out.println(sum);

    }

    public static void sumOfRangeMatrix(int a[][],int r,int c)
    {
        prefixRowColumns(a);
        System.out.println(a[r][c]);
    }

    public static void prefixSumMatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a[i].length;j++)
            {
                a[i][j] = a[i][j] + a[i][j-1];
            }
        }

    }
    public static void prefixRowColumns(int a[][])
    {
        prefixSumMatrix(a);
        for(int i=1;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                a[i][j] = a[i][j] + a[i-1][j];
            }
        }
    }

    

    
    public static void main(String[] args) {
        int arr[][]={
                    {1,1,1,1,1},
                    {1,1,1,1,1}
        };
        // subRecRangePrefix(arr, 0, 0, 1, 2);
        sumOfRangeMatrix(arr, 1, 2);
        
        
    }
    
}
