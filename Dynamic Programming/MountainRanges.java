import java.util.*;
public class MountainRanges {
    public static int mountainrangeMemo(int n, int arr[]){
        if(n==0 || n==1){
            return 1;
    }
    if(arr[n]!=0){
        return arr[n];
}
int ans = 0;
         for(int i=0;i<=n-1;i++){
            ans+=mountainrangeMemo(i, arr)*mountainrangeMemo(n-i-1, arr);
         }
         arr[n] = ans;
         return arr[n];
    }

    public static int MountainRangesTopDown(int n,int arr[]){
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                arr[i] = arr[i]+ arr[j]*arr[i-j-1];
            }
        }
        return arr[n];
    }
    public static void main(String args[]){
        int n=5;
        int arr[] = new int[n+1];
        Arrays.fill(arr,0);
        //System.out.println(mountainrangeMemo(n, arr));
        System.out.println(MountainRangesTopDown(n, arr));
    }
}
