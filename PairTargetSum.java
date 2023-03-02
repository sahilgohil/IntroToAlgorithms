import java.util.ArrayList;

public class PairTargetSum {
    

    public static void main(String[] args) {
    
        int arr[] = {4,6,3,5,8,2};
        ArrayList<Pair> getTargetPairs = targetSum(arr, 7);
        for(Pair p:getTargetPairs)
        {
            System.out.printf("Num1: %d + Num2: %d = %d%n",p.getNum1(),p.getNum2(),p.getNum1()+p.getNum2());
        }
    }


    // find the target sum in an array
    public static ArrayList<Pair> targetSum(int arr[],int target)
    {
        ArrayList <Pair> pairs = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            int current = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if( (current + arr[j]) == target)
                {
                    Pair pair1 = new Pair(current, arr[j]);
                    pairs.add(pair1);
                }
            }
        }
        return pairs;
    }

}
class Pair{
    private int num1;
    private int num2;

    Pair(int n, int n2){
        this.num1 =n;
        this.num2 = n2;
    }
    public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }
}
