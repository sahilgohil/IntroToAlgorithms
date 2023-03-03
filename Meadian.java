import java.util.Arrays;
import java.util.List;

public class Meadian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int si = 0;
        int si2 = 0;
        int num3[] = new int[nums1.length+nums2.length];
        int x= 0;
        while(si< nums1.length && si2<nums2.length)
        {
            if(nums1[si] < nums2[si2])
            {
                num3[x++] = nums1[si++];
            }
            else{
                num3[x++] = nums2[si2++];
            }
        }
        while(si< nums1.length)
        {
            num3[x++] = nums1[si++];
        }
        while(si2<nums2.length )
        {
            num3[x++] = nums2[si2++];
        }
        // for(int i:num3)
        // {
        //     System.out.println(i);
        // }
        
        if(num3.length % 2 !=0)
        {
            return (double) num3[num3.length/2];
        }
        else
        {
            int idx1 =num3.length/2;
            int idx2 =idx1-1;
            double med  = (num3[idx1]+num3[idx2])/2.0;

            return med;
            
        }
        
        


    }

    public static void main(String[] args) {
        
        int arr1[] = {1,3};
        int arr2[] = {2,4};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
    
}
