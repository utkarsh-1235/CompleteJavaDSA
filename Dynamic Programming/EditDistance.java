public class EditDistance {
    public static int editDistance(String str1, String str2, int n,int m){

        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
              for(int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j] = j;
                }
                if(j==0){
                    dp[i][j] = i;
                }
              }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j]+1,Math.min(dp[i][j-1]+1,dp[i-1][j-1]+1));
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
        String str1 = "intention";
        String str2 = "execution";
        System.out.println(editDistance(str1, str2, str1.length(), str2.length()));
    }
}
