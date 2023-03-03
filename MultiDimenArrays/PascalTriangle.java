package MultiDimenArrays;

public class PascalTriangle {
    public static void printPascal(int n)
    {
        // first create a 2d array with n row and no column initialized
        int tri[][] = new int[n][];

        for(int i=0;i<tri.length;i++)
        {
            // initialize column for every row as each row has row num+1 col
            // assign the values at col 0 and last col to 1
            // arr[i][0] == arr[i][i] =1
            // then for the middle values
            // in loop starting from 1 to <i
            // make arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            // done
            
            tri[i] = new int[i+1];
            tri[i][0] = tri[i][i] = 1;
            for(int j=1;j<i;j++)
            {
                tri[i][j] = tri[i-1][j] + tri[i-1][j-1];
            }

        }

        Matrix.printMatrix(tri);
    }
    public static void main(String[] args) {
        printPascal(5);
    }
    
}
