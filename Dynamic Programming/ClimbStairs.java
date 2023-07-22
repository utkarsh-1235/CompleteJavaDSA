//import java.util.Arrays;
public class ClimbStairs {
    // public static int ClimbStairs(int n){
    //     if(n<0){
    //         return 0;
    //     }
    //     if(n==0){
    //         return 1;
    //     }
    //     return ClimbStairs(n-1)+ClimbStairs(n-2);
    // }

    // public static int ClimbStairs(int dp[], int n){
    //    if(n==0){
    //     return 1;
    //    }
    //    if(n<0){
    //     return 0;
    //    }
    //    if(dp[n]!=-1){
    //      return dp[n];
    //    }
    //    dp[n] = ClimbStairs(dp, n-1)+ClimbStairs(dp, n-2)+ClimbStairs(dp, n-3);
    //         return dp[n];
    // }
    public static int ClimbStairsTab(int n){
      int dp[] = new int[n+1];
      dp[0] = 1;
      for(int i=1;i<=n;i++){
        if(i==1){
          dp[i] = dp[i-1];
        }
        else{
          
          dp[i] = dp[i-1]+dp[i-2];
        }
        
    
      }
      return dp[n];
    }
    public static void main(String args[]){
        int n = 4;
        // int dp[] = new int[n+1];
        // Arrays.fill(dp,-1);
    System.out.println(ClimbStairsTab(n));
    }
}
