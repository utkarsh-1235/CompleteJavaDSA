public class CountTheWaysOFSubsetSum {

    public static int CountWays(int sum[],int n){
        int arr[][] = new int[sum.length+1][n+1];

        for(int i=0;i<sum.length+1;i++){
            arr[i][0] = 1;
        }

        for(int i=1;i<sum.length+1;i++){
            for(int j=1;j<n+1;j++){
                if(sum[i-1]<=j){
                    arr[i][j] = arr[i-1][j-sum[i-1]]+arr[i-1][j]; 
                }
                else{
                    arr[i][j] = arr[i-1][j];
                }
            }
        }
        print(arr);
        return arr[sum.length][n];
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

        int sum[] = {1,1,1,1,1};
        int targetSum = 10;
        System.out.println("Possible Subsets are"+" "+CountWays(sum,targetSum));
    }

}
