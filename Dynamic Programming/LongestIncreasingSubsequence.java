import java.util.*;
public class LongestIncreasingSubsequence {
    public static int longestIncreasingSubsequence(int arr[]){
        
        HashSet<Integer> hash = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hash.add(arr[i]);
        }

        int n =  hash.size();
        int arr1[] = new int[n];  // sorted unique elements

        int i = 0;
        for(int num : hash){
            arr1[i] = num;
            i++;
        }
        Arrays.sort(arr1);
        return lcs(arr,arr1);
    }

    public static int lcs(int arr[],int arr1[]){
        int dp[][] = new int[arr.length+1][arr1.length+1];

        for(int i=0;i<arr.length+1;i++){
            for(int j=0;j<arr1.length+1;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }

        }
        for(int i=1;i<arr.length+1;i++){
            for(int j=1;j<arr1.length+1;j++){
                 if(arr[i-1] == arr1[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                 }
                 else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                 }
            }
        }
        print(dp);
        return dp[arr.length][arr1.length];

    }
    public static void print(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int arr[] = {10,9,2,5,3,7,101,18};
        System.out.println(longestIncreasingSubsequence(arr));
        
    }
}
