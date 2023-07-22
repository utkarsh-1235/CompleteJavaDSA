import java.util.*;
public class MaxSubarrayUsingKadanesAlgorithm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array");
        int n = sc.nextInt();
        int [] arr = new int[100];
         int curSum = 0;
         int maxSum = Integer.MIN_VALUE;
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++)
        {
             curSum = curSum+arr[i];
                if(curSum < 0){
                    curSum = 0;
                }
          maxSum = Math.max(maxSum, curSum);
               
        }
        System.out.println("Maximum sum is"+" "+maxSum);
}
}
