public class UnboundedKnapsack {
    public static int unboundedKnapsack(int val[],int wt[],int w){
         int arr[][] = new int[val.length+1][w+1];
         for(int i=0;i<arr.length;i++){
            arr[i][0]=0;
         }
        for(int j=0;j<arr[0].length;j++){
            arr[0][j] = 0;
        }
         
         for(int i=1;i<val.length+1;i++){
            for(int j=1;j<w+1;j++){
                if(wt[i-1] <= j){
                    arr[i][j] = Math.max(val[i-1]+arr[i][j-wt[i-1]],arr[i-1][j]);
                }
                else{
                    arr[i][j] = arr[i-1][j];
                }
            }
         }
         print(arr);
         return arr[val.length][w];

        // int n = val.length;
        // int arr[][] = new int [n+1][w+1];
        // for(int i=0;i<arr.length;i++){
            
        //     arr[i][0] = 0;
        // }
        // for(int j=0;j<arr[0].length;j++){
            
        //     arr[0][j] = 0;
        // }
        // for(int i=1;i<n+1;i++){
        //     for(int j=1;j<w+1;j++){
        //         if(wt[i-1]<=j){
        //         arr[i][j] = Math.max(val[i-1]+arr[i][j-wt[i-1]],arr[i-1][j]);
        //         }
        //         else{
        //             arr[i][j] = arr[i-1][j];
        //         }
        //     }
        // }
        // print(arr);
        // return arr[n][w];
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
        int val[] = {1,4,5,7};
        int wt[] = {1,3,4,5};
        int w = 8;
        System.out.println(unboundedKnapsack(val, wt, w));
    }
}
