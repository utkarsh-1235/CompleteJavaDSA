import java.util.ArrayList;
public class ContainerWithMostWater{
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);

        //BruteForce Approach
       /*  int maxWater = 0;

        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                 int ht = Math.min(arr.get(i), arr.get(j));
                 int width = j-i;
                 int curWater = width*ht;
                 maxWater = Math.max(curWater,maxWater);
            }
        }*/

        // 2 pointer Approach

    int left = 0;
    int right = arr.size()-1;
     
    int maxWater = 0;
    while(left<right){
       int ht = Math.min(arr.get(left),arr.get(right));

       int width = right-left;

       int curWidth = ht * width;
        maxWater = Math.max(maxWater, curWidth);

        if(arr.get(left)<arr.get(right)){
            left++;
        }
        else{
            right--;
        }
    }
      System.out.println(maxWater);
    }
}