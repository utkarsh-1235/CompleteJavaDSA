public class WildCardMatchingProblem {
    public static boolean WildcardMatching(String S,String P){
        int n = S.length();
        int m = P.length();
        boolean dp[][] = new boolean[n+1][m+1];

        //initialization
        dp[0][0] = true;

        // pattern = " "
        for(int i=1;i<n+1;i++ ){
            dp[i][0] = false;
        }
            
        //String = " "
            for(int j=1;j<m+1;j++){
                if(P.charAt(j-1) == '*'){
                    dp[0][j] = dp[0][j-1];
                }
            }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(S.charAt(i-1) == P.charAt(j-1) || P.charAt(j-1)=='?'){
                      dp[i][j] = dp[i-1][j-1];
                }
                else if(P.charAt(j-1)=='*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        print(dp);
        return dp[n][m];
    }

    public static void print(boolean dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        String s = "abc";
        String p = "**?b*";
        System.out.println(WildcardMatching(s, p));
    }
}
