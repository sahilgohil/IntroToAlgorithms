package ArrayMisc;

import java.util.Scanner;

public class SearchFreqArray {

    public static int[] makeFreqArray(int arr[]){

        int freq[] = new int[100005];

        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        
        int arr[] = { 5, 230, 30, 4002, 342 };
        int freq[] = makeFreqArray(arr);

        Scanner input = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        System.out.println("Enter the number of quries");
        int q= input.nextInt();

        while(q>0)
        {
            System.out.print("search for any number: ");
            int key = input.nextInt();
            if(freq[key] >0)
            {
                System.out.println("Found");
            }
            else{
                System.out.println("Not Found");
            }

            q--;
        }

    }
    
}
