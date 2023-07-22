import java.util.*;
public class SpiralMatrix {
    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int Matrix[][] = new int[4][4];
          int n = Matrix.length;
          int m = Matrix[0].length;
            System.out.println("Enter the Matrix");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    Matrix[i][j] = sc.nextInt();
                }
            }

            int StartRow = 0;
            int EndRow = n-1;
            int StartCol = 0;
            int EndCol = m-1;

            while(StartRow <= EndRow && StartCol <= EndCol){
               // Top
               for(int j=StartCol;j<=EndCol;j++){
                System.out.print(Matrix[StartRow][j]+" ");
               }

               // Right
               for(int j=StartRow+1;j<=EndRow;j++){
                System.out.print(Matrix[j][EndCol]+" ");
               }

               // Bottom
               for(int j=EndCol-1;j>=StartCol;j--){
                if(StartRow==EndRow){
                    break;
                }
                System.out.print(Matrix[EndRow][j]+" ");
               }

               //Left
               for(int j=EndRow-1;j>=StartRow;j--){
                if(StartCol==EndCol){
                    break;
                }
                System.out.print(Matrix[j][StartCol]+" ");
               }

               StartCol++;
               StartRow++;
               EndCol--;
               EndRow--;
            }
            System.out.println();
    }
}
