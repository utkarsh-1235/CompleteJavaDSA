public class Knapsack01 {
    public static int knapsackRecursive(int wt[],int val[],int w, int n){
   
        // base case
        if(w==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=w){
            return (int)Math.max(val[n-1]+knapsackRecursive(wt, val, w-wt[n-1], n-1),knapsackRecursive(wt, val, w, n-1));
        }
        // else{
        // }
        return knapsackRecursive(wt, val, w, n-1);
    
    }

    // Memoization

    public static int knapsack01(int val[],int wt[],int w,int n, int arr[][]){
                // base case
        if(w==0 || n==0){
            return 0;
        }
        if(arr[n][w]!=-1){
            return arr[n][w];
        }
        if(wt[n-1]<=w){
            arr[n][w] =  Math.max(val[n-1]+knapsack01(val, wt, w-wt[n-1], n-1,arr),knapsack01(val, wt, w, n-1,arr));

            return arr[n][w];
        }
        else{
            arr[n][w] =  knapsack01(val,wt, w, n-1,arr);
            return arr[n][w];
        }
    
    }
      
    
    // public static int knapsack01(int val[],int wt[],int w,int n,int arr[][]){

    //     //int arr[][] = new int [n+1][w+1];
    //     // base case
    //     if(n==0 || w==0){
    //         return 0;
    //     }

    //     if(arr[n][w]!=-1){
    //         return arr[n][w];
    //     }
    //     if(wt[n-1]<=w){
    //        arr[n][w]=Math.max(val[n-1]+arr[n-1][w-wt[n-1]],arr[n-1][w]);
    //        return arr[n][w];
    //     }
    //     else{
    //         arr[n][w] = arr[n-1][w];
    //         return arr[n][w];
    //     }
        
    // }

    // Tabulation
    public static int knapsackTabu(int val[],int wt[], int w){
      int n = val.length;
        int arr[][] = new int [n+1][w+1];
        for(int i=0;i<arr.length;i++){
            
            arr[i][0] = 0;
        }
        for(int j=0;j<arr[0].length;j++){
            
            arr[0][j] = 0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                if(wt[i-1]<=j){
                arr[i][j] = Math.max(val[i-1]+arr[i-1][j-wt[i-1]],arr[i-1][j]);
                }
                else{
                    arr[i][j] = arr[i-1][j];
                }
            }
        }
        print(arr);
        return arr[n][w];
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
        int w = 7;
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        
        // int arr[][]= new int[val.length+1][w+1];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //           arr[i][j]=-1;
        //           //System.out.print(arr[i][j]);
        //     }
            //System.out.println();
            System.out.println(knapsackTabu(val,wt,w));
            
        }
        
    }

