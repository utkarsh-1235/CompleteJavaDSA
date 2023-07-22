import java.util.*;
public class LongestCommonSubsequence{
    public static int longestcommonsubsequence(String str1,String str2,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
      
        
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            
            return 1+longestcommonsubsequence(str1, str2, n-1, m-1);
        }
        else{
            
            return Math.max(longestcommonsubsequence(str1, str2, n-1, m),longestcommonsubsequence(str1, str2, n, m-1));
        }
    }
    public static int lcsMemoization(String str1,String str2,int n,int m,int dp[][]){

        // base case
        if(n==0 || m==0){
            return 0;

        }
        
        
        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(str1.charAt(n-1)==str2.charAt(m-1)){
            dp[n][m] = 1+lcsMemoization(str1, str2, n-1, m-1, dp);
        }
        else{
            dp[n][m] = Math.max(lcsMemoization(str1, str2, n-1, m, dp),lcsMemoization(str1, str2, n, m-1, dp));
        }
        print(dp);
        return dp[n][m];
    }

    public static int lcsTabu(String str1,String str2,int n,int m){
        int dp[][] = new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            dp[i][0] = 0;
        }
        for(int j=0;j<m+1;j++){
            dp[0][j] = 0;
        }

        for(int i=1;i<n+1;i++){
             for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                  dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
             }
        }
        print(dp);
        return dp[n][m];
    }
    public static void print(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        String str1 = "abcd";
        String str2 = "aceb";
    // int dp[][] = new int[str1.length()+1][str2.length()+1];
    // for(int i=0;i<dp.length;i++){
    //     for(int j=0;j<dp[0].length;j++){
    //         dp[i][j] = -1;
    //     }
    // }
        System.out.println(lcsTabu(str1, str2, str1.length(), str2.length()));
    }
}