import java.util.*;
public class PrintMatrix{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     int [][]Matrix = new int[3][3];
     int n = Matrix.length;
     int m = Matrix[0].length;
     System.out.println("Enter the Elements of an array");
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            Matrix[i][j] = sc.nextInt();
        }
     }
     
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(Matrix[i][j]); 
        }
        System.out.println();
     }
  }
}