import java.util.*;
public class TilingProblem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Breadth of floor");
        int n = sc.nextInt();

        System.out.println(tilingproblem(n));
    }
    public static int tilingproblem(int n){
           
        // Base case
        if(n==0||n==1){
            return 1;
        }

        //Horizontal choice
        int fnm1 = tilingproblem(n-1);

        //Vertical choice
        int fnm2 = tilingproblem(n-2);

        int totalways = fnm1+fnm2;
        return totalways;
    }
}
