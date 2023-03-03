package MultiDimenArrays;

public class MatrixSum {

    public static void sumMatrix (int [][]a,int[][]b)
    {
        int rowA = a.length;
        int rowB = b.length;
        int colA = a[0].length;
        int colB = b[0].length;

        if(rowA !=rowB || colA!= colB)
        {
            System.out.println("Matrices are not compatible to sum");
            return;
        }
        int sum[][] = new int[rowA][colA];

        for(int i=0;i<a.length;i++) // row number
        {
            for(int j=0;j<a[0].length;j++) // col number
            {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        
        Matrix.printMatrix(sum);

        
    }

    public static void main(String[] args) {
        
        int num1[][] = {{1,2,3},{4,5,6}};
        int num2[][] = {{1,2,3},{4,5,6}};
                        
        sumMatrix(num1, num2);

    }
    
}
