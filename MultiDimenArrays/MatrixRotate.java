package MultiDimenArrays;


//rotate the matrix by 90 degrees
public class MatrixRotate {
    
    public static void rotateMatrixBy90(int a[][])
    {
        // to rotate the matrix by 90 degrees
        // you need to first make the transpose of the matrix
        // and then reverse each row in the matrix using swap
        // resulting array will be 90 degree rotated
        int transpose[][] = MatrixTranspose.getTransposeOfMatrix(a);
        for(int i=0;i<transpose.length;i++)
        {
                int left = 0;
                int right = transpose[i].length-1;

                while(left<=right)
                {
                    swap(transpose[i], left, right);
                    left++;
                    right--;
                }
        }
        Matrix.printMatrix(transpose);
    }
    public static void swap(int arr[],int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int rotate[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before Rotation");
        Matrix.printMatrix(rotate);
        System.out.println("After Rotation");
        rotateMatrixBy90(rotate);
    }

}
