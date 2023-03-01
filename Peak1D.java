/**
 * Peak1D
 */
public class Peak1D {

    public static void main(String[] args) {
        
        // here the complexity of this one dimenrional peak finding algorithm is O(n)
        // loop through all the elements of the array
        // if checking the first element that a >= b then peak = a
        // if checking the last element that last >= secondLast then peak = last
        // if checking the rest of the element s that this element >= previous element and this element >= next element and this element >= peak
        // then assign this to peak

        int numbers[] = {10,5,3,6,7,9,4,3,11};

        int peak = 0;

        // for(int i=0;i<numbers.length;i++)
        // {
        //     if(i==0)
        //     {
        //         if(numbers[i] >= numbers[i+1])
        //         {
        //             peak = numbers[i];
        //         }
            
        //     }
        //     else if(i==numbers.length-1)
        //     {
        //         if(numbers[numbers.length-1]>= numbers[numbers.length-2])
        //         {
        //             peak = numbers[numbers.length-1];
        //         }
        //     }
        //     else{
        //         if(numbers[i] >= numbers[i-1] && numbers[i] >= numbers[i+1] && numbers[i] > peak)
        //         {
        //             peak = numbers[i];
        //         }
        //     }

        // }
        // System.out.println("The peak is: "+peak);

        // lets do it a better way by using divide and conquor algorithm
        // divide and conquor algorith only works if the array items are sorted

        // go to the middle of the element and check that the previous and the next element
        // if middle >= previous and middle >= next then peak =  middle
        // if middle <= previous then search the left half
        // if middle <= next then search the right half

        int n = numbers.length;
        for(int i=0; i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(numbers[j] > numbers[j+1])
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                }
            }
        }
        for(int num:numbers)
        {
            System.out.printf("%-2d",num);
        }

        int left = 0;
        int right = numbers.length;
        while(left <=right)
        {
            int middle = left +(right-left)/2;

           
            if(middle == numbers.length-1)
            {
                if(numbers[middle] >= numbers[middle-1])
                {
                    peak = numbers[middle];
                    break;
                }
            }
            if(middle == 0)
            {
                if(numbers[middle] >= numbers[middle+1])
                {
                    peak = numbers[middle];
                    break;
                }
            }
            else
            {
                if(numbers[middle] >= numbers[middle-1] && numbers[middle] >= numbers[middle+1])
                {
                    peak = numbers[middle];
                }
                else if(numbers[middle] < numbers[middle-1])
                {
                    right = middle-1;
                }
                else
                {
                    left = middle+1;
                }

            }

            
            
    
        }
        System.out.println("The peak is: "+peak);

    }
    
}