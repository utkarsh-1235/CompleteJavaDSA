import java.util.*;
public class MinimumArrayJumps {
    public static int minimumArrayJumps(int arr[]){
            int n = arr.length;
            int dp[] = new int[arr.length];

        Arrays.fill(dp,-1);

            dp[n-1] = 0;
              int min = 0;
            for(int i=n-2;i>=0;i--){
                int steps = arr[i];
                int ans = Integer.MAX_VALUE;
                for(int j=i+1;j<=i+steps&&j<n;j++){
                    if(dp[j]!=-1){
                       ans = Math.min(ans,dp[j]+1);
                    }
                }
                if(ans!=Integer.MAX_VALUE){
                    dp[i] = ans;
                }
            }
            print(dp);
            System.out.println();
            return dp[0];
    }
    public static void print(int dp[]){
        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {2,1,1,5,8};
        
        System.out.println(minimumArrayJumps(arr));
    }
}
