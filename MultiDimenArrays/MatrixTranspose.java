package MultiDimenArrays;


public class MatrixTranspose {

    public static void transposeOfMatrix(int a[][])
    {
        int row = a.length;
        int col = a[0].length;
        int transpose[][] = new int[col][row];

        for(int i=0;i<transpose.length;i++) // rows
        {
            for(int j=0;j<transpose[0].length;j++) //columns
            {
                transpose[i][j] = a[j][i];
            }
        }

        Matrix.printMatrix(transpose);

    }
    public static int[][] getTransposeOfMatrix(int a[][])
    {
        int row = a.length;
        int col = a[0].length;
        int transpose[][] = new int[col][row];

        for(int i=0;i<transpose.length;i++) // rows
        {
            for(int j=0;j<transpose[0].length;j++) //columns
            {
                transpose[i][j] = a[j][i];
            }
        }

        return transpose;

    }
    public static void transposeInplace(int a[][])
    {
        if(a.length != a[0].length)
        {
            System.out.println("This is not the square matrix, Transpose inplace is not possible");
            return;
        }
        for(int i=0;i<a.length;i++) // rows
        {
            for(int j=i;j<a[0].length;j++) //columns
            {
                
                
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                
                
            }
        }
        Matrix.printMatrix(a);
    }
    public static void main(String[] args) {
        
        int mat[][] = {{1,2,3},{4,5,6}};
        Matrix.printMatrix(mat);
        System.out.println("Transpose of matrix");
        transposeOfMatrix(mat);

        int squareMat[][] = {{1,2},{3,5}};
        Matrix.printMatrix(squareMat);
        System.out.println("transpose in place");
        transposeInplace(squareMat);
    }
    
}
