import java.util.*;
public class MaximumSubarraySum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array");
        int n = sc.nextInt();
        int [] arr = new int[n];
         int sum = 0;
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
            
        
        int [] prefix = new int[n];
        int maxSum = Integer.MIN_VALUE;
        int curSum=0;

        prefix[0] = arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for (int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++){
                curSum=0;
                  
                // Bruteforce approach

              /*  for(int k=i;k<=j;k++){
                curSum = curSum+arr[k];
                }*/

                curSum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];

               if(maxSum<curSum){
                maxSum = curSum ;
               }
            }
        }
        System.out.println("Maximum Sum is"+" "+maxSum);
}
}
