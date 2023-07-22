import java.util.*;
public class TrappingRainWater {
    public static int TrappingWater(int height[]){

        //Calculate leftMax boundary
        int [] leftMax = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        

        // Calculate RightMax boundary
        int [] rightMax = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i= height.length-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1] );
        }

        // So Waterlevel = min(leftMax , rightMax)
          
        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
           int Waterlevel = Math.min(leftMax[i],rightMax[i]);

           trappedWater = trappedWater + Waterlevel - height[i];
        }
        return trappedWater ; 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many blocks");
        int n = sc.nextInt();
        int [] height = new int[n];
         
        System.out.println("Enter the height of the blocks");
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
      System.out.println("Total water trapped between the blocks"+TrappingWater(height)+"units");
      }  
}
