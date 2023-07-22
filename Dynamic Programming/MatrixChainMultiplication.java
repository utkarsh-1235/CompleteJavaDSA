import java.util.*;
public class MatrixChainMultiplication {
        //Recursion
        public static int MatrixChainRecursion(int arr[],int i,int j){
            //base case
            if(i==j){
                return 0;
            }
            int ans = Integer.MAX_VALUE;
            for(int k=i;k<=j-1;k++){
                int cost1 = MatrixChainRecursion(arr, i, k);  // Ai.......Ak = A[i-1]*[k]
                int cost2 = MatrixChainRecursion(arr,k+1,j); // Ak+1......Aj = A[k]*A[j]
                
                int cost3 = arr[i-1]*arr[k]*arr[j];
    
                int finalcost = cost1+cost2+cost3;
                ans = Math.min(finalcost,ans);
            }
            return ans;
        }
             
         // Memoization
    
         public static int MatricChainMemo(int dp[][],int arr[],int i,int j){
            //Base Case
            if(i==j){
                return 0;
            }
            if(dp[i][j]!=-1){
                return dp[i][j];
            }
            int ans = Integer.MAX_VALUE;
            for(int k =i;k<=j-1;k++){
                int cost1=MatricChainMemo(dp,arr, i, k);
                int cost2=MatricChainMemo(dp,arr, k+1, j);
                int cost3 = arr[i-1]*arr[k]*arr[j];
    
                int finalCost = cost1+cost2+cost3;
                 ans = Math.min(finalCost,ans);
            }
            dp[i][j] = ans;
            return dp[i][j];
         }
      
                       // Tabulation
        public static int MatrixChainTabu(int arr[]){
            int n = arr.length;
            int dp[][] = new int[n][n];
    
            // initialization
            for(int i=0;i<n;i++){
                dp[i][i] = 0;
            }
    
            for(int len =2;len<n;len++){
                for(int i=1;i<=n-len;i++){
                    int j = i+len-1;
    
                    dp[i][j] = Integer.MAX_VALUE;
                    for(int k = i;k<=j-1;k++){
                        int cost1 = dp[i][k];
                        int cost2 = dp[k+1][j];
                        int cost3 = arr[i-1]*arr[k]*arr[j];
                        int finalCost = cost1+cost2+cost3;
                        dp[i][j] = Math.min(dp[i][j],finalCost);
                    }
                }
            }
            print(dp);
            return dp[1][n-1];
        }

        public static void print(int dp[][]){
            for(int i=0;i<dp.length;i++){
                for(int j=0;j<dp[0].length;j++){
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
            }
            
        }
        public static void main(String args[]){
            int arr[] = {1,2,3,4,3};
            //int n = arr.length;
        
        System.out.println(MatrixChainTabu(arr));
        }
    }
        
    
