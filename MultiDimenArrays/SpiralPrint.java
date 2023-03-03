package MultiDimenArrays;

public class SpiralPrint {

    public static void makeSpiralSquareMatrix(int n)
    {
        int rows = n;
        int cols = n;
        int totalElements = 1;
        int mat[][] = new int [rows][cols];
        int topRow = 0;
        int bottomRow = rows-1;
        int leftColm = 0;
        int rightColm = cols-1;

        while(totalElements < n*n+1)
        {
            for(int i=leftColm;i<=rightColm && totalElements <n*n+1;i++)
            {
                mat[topRow][i] = totalElements;
                totalElements++;
            }
            topRow++;

            for(int i=topRow;i<=bottomRow && totalElements <n*n+1;i++)
            {
                mat[i][rightColm] = totalElements;
                totalElements++;
            }
            rightColm--;

            for(int i=rightColm;i>= leftColm && totalElements <n*n+1;i--)
            {
                mat[bottomRow][i] = totalElements;
                totalElements++;
            }
            bottomRow--;

            for(int i=bottomRow;i>=topRow && totalElements <n*n+1;i--)
            {
                mat[i][leftColm] = totalElements;
                totalElements++;
            }
            leftColm++;

        }
        Matrix.printMatrix(mat);
    }

    public static void spiralPrint(int a[][])
    {
        int rows = a.length;
        int cols = a[0].length;

        int topRow = 0;
        int bottomRow = rows-1;
        int leftColm = 0;
        int rightColm = cols-1;

        int totalElements = 0;

        while(totalElements <rows*cols)
        {
            for(int i=leftColm;i<=rightColm && totalElements <rows*cols;i++)
            {
                System.out.print(a[topRow][i]+" ");
                totalElements++;
            }
            topRow++;
            System.out.println();
            for(int i=topRow;i<=bottomRow && totalElements <rows*cols;i++)
            {
                System.out.print(a[i][rightColm]+" ");
                totalElements++;
            }
            rightColm--;
            System.out.println();
            for(int i=rightColm;i>= leftColm && totalElements <rows*cols;i--)
            {
                System.out.print(a[bottomRow][i]+" ");
                totalElements++;
            }
            bottomRow--;
            System.out.println();
            for(int i=bottomRow;i>=topRow && totalElements <rows*cols;i--)
            {
                System.out.print(a[i][leftColm]+" ");
                totalElements++;
            }
            leftColm++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int mat[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {1,4,7,9}
        };
        // spiralPrint(mat);
        makeSpiralSquareMatrix(4);
    }
    
}
