public class RodCuttingProblem {

    public static int RodCutting(int price[],int Length[]){
        int arr[][] = new int[Length.length+1][price.length+1];

        //base case
        // for(int i=0;i<Length.length+1;i++){
        //     arr[i][0] = 0;
        // }
        for(int i=1;i<Length.length+1;i++){
            for(int j=1;j<price.length+1;j++){
                if(Length[i-1]<=j){
                    arr[i][j] = Math.max(arr[i][j-Length[i-1]]+price[i-1],arr[i-1][j]);
                }
                else{
                    arr[i][j] = arr[i-1][j];
                }
            }
        }
        print(arr);
        return arr[price.length][Length.length];
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
        int Length[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};
        System.out.println(RodCutting(price, Length));
    }
    
}
