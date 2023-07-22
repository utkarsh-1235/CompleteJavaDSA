import java.util.*;
public class DiagonalSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int [][] Matrix = new int[4][4];
        
        System.out.println("Matrix must be square");
        System.out.println("Enter the Elements of matrix");
        for(int i=0;i<4;i++){
               for(int j=0;j<4;j++){
                Matrix[i][j] = sc.nextInt();
               }
        }
  int primsum = 0;
  int secsum = 0;
       /*  for(int i=0; i<4;i++){
            for(int j=0;j<4;j++){
                if(i==j){
                    primsum += Matrix[i][j];
                }
                else if(i+j == Matrix.length-1){
                    secsum += Matrix[i][j];
                }
            }
        }*/


        // optimized 
        for(int i=0;i<Matrix.length;i++){
            //For First Diagonal sum
            primsum +=Matrix[i][i];

            int j = Matrix.length-1-i;

            //For Second Diagonal
            if(i!=Matrix.length-1-i){
                secsum += Matrix[i][j];

            }

        }
        System.out.println("Sum of first diagonal is"+primsum);
        System.out.println("Sum of Second diagonal is"+secsum);
    }
}
