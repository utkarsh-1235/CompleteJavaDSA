import java.util.*;
public class CountBSTs {
    //Memoization
    public static int countbstsMemo(int n,int arr[]){
        if(n==0 || n==1){
            return 1;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        int ans = 0;
        for(int j=0;j<=n-1;j++){
            ans += countbstsMemo(j,arr)*countbstsMemo(n-j-1,arr);
        }
        return ans;
    }

    // TopDown
    public static int countbstsTopDown(int n, int arr[]){
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<=i-1;j++){
                arr[i] = arr[i]+ arr[j]*arr[i-j-1];
            }
            
        }
        
        return arr[n];
    }
    public static void main(String args[]){
        int n=4;
        int arr[] = new int[n+1];
        Arrays.fill(arr,0);
        // System.out.println(countbstsMemo(n,arr));
        System.out.println(countbstsTopDown(n,arr));
    }
}
