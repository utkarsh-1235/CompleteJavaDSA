public class CoinChangeProblem {
    //Tabulation
    public static int CoinChange(int coin[],int sum){
        int arr[][] = new int[coin.length+1][sum+1];

        for(int i=0;i<coin.length+1;i++){
            arr[i][0] = 1;
        }
       

        for(int i=1;i<coin.length+1;i++){
           for(int j=1;j<sum+1;j++){
            //valid condition
            if(coin[i-1]<=j){
                arr[i][j] = (arr[i][j-coin[i-1]]+arr[i-1][j]);
            }
            else{
                arr[i][j] = arr[i-1][j];
            }
           }
        }
        print(arr);
        return arr[coin.length][sum];
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
        int coin[] = {1,2,5};
        int sum = 5;
        System.out.println(CoinChange(coin, sum)+" "+"ways");
    }
}
