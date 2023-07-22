import java.util.*;
public class SearchInASortedMatrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        int [][] Matrix = new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the key to search in matrix");
        int key = sc.nextInt();
        int row = 0 ;
        int col = Matrix.length-1;
        while(row < Matrix.length && col>= 0){
            if(Matrix[row][col]==key){
                System.out.println("Key found at ("+row+","+col+")");
                break;
            }
            else if(key<Matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
    }
}