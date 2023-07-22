import java.util.*;
public class CatalansNumber {

    //Recursive Approach
    public static int CatalanRecursive(int n){
        int c = 0;
      
        if(n==0 || n==1){
            return 1;
        }
        for(int i=0;i<n;i++){
            
            c = c+CatalanRecursive(i)*CatalanRecursive(n-i-1);
        }
        return c;
    }


    //Bottomup Approach

    public static int CatalanMemo(int n, int arr[]){
        if(n==0 || n==1){
            return 1;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        int ans = 0;
        for(int i=0;i<n+1;i++){
             ans = ans+CatalanMemo(i, arr)*CatalanMemo(n-i-1, arr);
        }
        arr[n] = ans;
        return arr[n];
    }

    //Tabulation

    public static int CatalanTabu(int n,int dp[]){
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i=2;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                dp[i] = dp[i]+dp[j]*dp[i-j-1];
                
            }
        }
        
        return dp[n];
    }
    public static void main(String[] args){
        int n=5;
        int arr[] = new int[n+1];
        Arrays.fill(arr,0);
        //System.out.println(CatalanMemo(n, arr));
//        System.out.println(CatalanRecursive(10));

        System.out.println(CatalanTabu(n, arr));
    }
}
