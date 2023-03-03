package MultiDimenArrays;

public class Matrix {
    public static void printMatrix(int matrix[][])
    {
        for(int i[]:matrix) // row
        {
            for(int j:i) // column
            {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
    
}
