import java.util.*;
public class FloodFillAlgorithm {
    public static void helper(int[][]image, int sr, int sc, int color, boolean vis[][],int orgCol){

        //Base case
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || vis[sr][sc]||image[sr][sc]!=orgCol){
            return ;
        }
        image[sr][sc] = color;

        //left
        helper(image, sr, sc-1, color, vis, orgCol);

        //right
        helper(image, sr, sc+1, color, vis, orgCol);

        //upper
        helper(image, sr-1, sc, color, vis, orgCol);

        //lower
        helper(image, sr+1, sc, color, vis, orgCol);
    }

    public static int[][] FloodFill(int img[][], int sr, int sc, int color){
        boolean vis[][] = new boolean[img.length][img[0].length];
        helper(img, sr, sc, color, vis, img[sr][sc]);
        return img;
    }

    public static void main(String args[]){
        int [][] image = {
                            {1,1,1},
                            {1,1,0},
                            {1,0,1}
        };

        int sr = 1, sc = 1, color = 2;

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;i++){
                image = FloodFill(image, sr, sc, color);
                System.out.println(image);
            }
        }
    }
}
