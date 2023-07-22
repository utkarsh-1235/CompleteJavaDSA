public class GridWays {
    public static int grid(int i,int j,int n,int m){
        if(i==n-1 && j==m-1 ){
            return 1;  // final corner ways
        }
        else if(i==n || j==m){
            return 0; // boundary cross condition
        }
        int w1 = grid(i+1,j,n,m);   // down
        int w2 = grid(i,j+1,n,m);  //right
        return w1+w2;
    }

    public static void main (String args[]){
        int n = 3;
        int m = 3;
        int arr[][] = new int[n][m];
        System.out.println(grid(0, 0, n, m)+" "+"ways");
    }
    
}
