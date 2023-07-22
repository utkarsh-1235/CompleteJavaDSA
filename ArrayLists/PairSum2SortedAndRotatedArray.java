import java.util.*;
public class PairSum2SortedAndRotatedArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        int bp = -1;

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>arr.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        int sum = 0;

        System.out.println("Enter the target");
        int target = sc.nextInt();
        while(lp != rp){
             sum = arr.get(lp)+arr.get(rp);

             if(sum==target){
                System.out.println("The pair is("+arr.get(lp)+","+arr.get(rp)+")");
            
            }
             if(sum<target){
                lp = (lp+1)%arr.size();
            }
            else{
              rp = (arr.size()+rp-1)%arr.size();
            }
        }
        
    }
}
