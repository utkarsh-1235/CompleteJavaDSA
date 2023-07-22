public class Factorial{
    public static int Fibo(int n, int arr[]){
        if(n==0||n==1){
            return n;
        }
        if(arr[n]!=0){
            return arr[n];
        }
        arr[n] = Fibo(n-1, arr)+Fibo(n-2, arr);
        return arr[n];

    }
    public static int FiboTabulation(int n){
        int dp[] = new int[n+1];
        dp[1] = 1;
      for(int i=2;i<=n;i++){
        dp[i] = dp[i-1]+dp[i-2];
      }
      return dp[n];
    }
    public static void main(String args[]){
        int n = 5;
        // int arr[] = new int[n+1];
        // System.out.println(Fibo(n, arr));

        System.out.println(FiboTabulation(n));
    }
}