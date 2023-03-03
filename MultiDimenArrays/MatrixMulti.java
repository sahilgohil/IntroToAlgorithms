package MultiDimenArrays;

public class MatrixMulti {

    public static void multiplyMatrices(int a[][],int b[][])
    {
        int rowA = a.length;
        int rowB = b.length;
        int colA = a[0].length;
        int colB = b[0].length;
        if(colA != rowB)
        {
            System.out.println("Conditions for multiplication not met");
            return;
        }
        int mul[][] = new int[rowA][colB];

        for(int i=0;i<mul.length;i++) // row of mul
        {
            for(int j=0;j<mul[0].length;j++) // col num of mul
            {
                for(int k=0;k<colA;k++)
                {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        Matrix.printMatrix(mul);
        
    }

    public static void main(String[] args) {
        
        int num1[][] = {{1,2,3},{4,5,6}};
        int num2[][] = {{1,2,3},{4,5,6},{1,2,3}};

        multiplyMatrices(num1, num2);

    }
    
}
