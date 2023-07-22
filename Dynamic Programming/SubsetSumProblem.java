public class SubsetSumProblem {
    public static void main(String args[]){
        int sum[] = {4,2,7,1,3};
        int TargetSum = 10;

        System.out.println(SubsetSum2(sum, TargetSum));
    }
    public static boolean SubsetSum(int sum[], int n){
        boolean arr[][] = new boolean[sum.length+1][n+1];
        // for(int j=1;j<sum.length+1;j++){
        //     arr[0][j] = false;
        // }
        for(int i=0;i<sum.length+1;i++){
            arr[i][0] = true;
        }

        for(int i=1;i<sum.length+1;i++){
            for(int j=1;j<n+1;j++){
                // include
                if(sum[i-1]<= j ){
                    //arr[i][j] = true;
                    arr[i][j] = arr[i-1][j-sum[i-1]] || arr[i-1][j];
                }
                else {
                    arr[i][j] = arr[i-1][j];
                }
            }
        }
        print(arr);
        return arr[sum.length][n];
    }

    public static boolean SubsetSum2(int sum[], int n){
        boolean arr[][] = new boolean[sum.length+1][n+1];
        // for(int j=1;j<sum.length+1;j++){
        //     arr[0][j] = false;
        // }
        for(int i=0;i<sum.length+1;i++){
            arr[i][0] = true;
        }

        for(int i=1;i<sum.length+1;i++){
            for(int j=1;j<n+1;j++){
                // include
                if(sum[i-1]<= j && arr[i-1][j-sum[i-1]] == true){
                    arr[i][j] = true;
                    
                }
                else if(arr[i-1][j] == true) {
                    arr[i][j] = true;
                }
            }
        }
        print(arr);
        return arr[sum.length][n];
    }

    public static void print(boolean arr[][]){
           for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                  System.out.print(arr[i][j]+" ");
            }
            System.out.println();
           }
    }

    
}
