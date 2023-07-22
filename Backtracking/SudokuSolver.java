public class SudokuSolver {
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //Column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //Row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }

        // Grid
        int startingRow = (row/3)*3;
        int startingColumn = (col/3)*3;
        for(int i=startingRow;i<startingRow+3;i++){
            for(int j=startingColumn;j<startingColumn;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }


  public static boolean sudokusolver(int sudoku[][],int row,int col){
    //base case
        if(row==9){
            return true;
        }else if(row==9){
            return false;
        }
    //recursion
    int nextRow = row;
    int nextCol = col;
    
    if(col+1 == 9){
        nextRow = row;
        nextCol = 0;
    }
    if(sudoku[row][col]!=0){
        return sudokusolver(sudoku, nextRow, nextCol);
    }
    for(int digit=1;digit<=9;digit++){
        if(isSafe(sudoku,row,col,digit)){
            sudoku[row][col] = digit;
            if(sudokusolver(sudoku, nextRow, nextCol)){
                return true;
            }
            sudoku[row][col] = 0;
        }
    }
    return false;
  }    
  public static void printArray(int sudoku[][]){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(sudoku[i][j]+" ");
        }
        System.out.println();
    }
  }
  public static void main(String args[]){
     int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}};
    if(sudokusolver(sudoku, 0, 0)){
        System.out.println("Solution exists");
        printArray(sudoku);
    }
    else {
        System.out.println("Solution does not exist");
    }
  }
}
