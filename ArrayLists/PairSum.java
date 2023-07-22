import java.util.*;
public class PairSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        int sum = 0;
        System.out.println("Enter the target sum");
        int target = sc.nextInt();
        /*for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                sum = arr.get(i) +arr.get(j);

                if(sum == target){
                    System.out.println("Yes you got it");
                    break;
                }
                else{
                    
                    System.out.println("Sorry try next time");
                }
            }
        }*/
        int left = 0;
        int right = arr.size()-1;

        while(left!=right){
            sum = arr.get(left)+arr.get(right);
            if(sum == target){
                System.out.println("The pair is("+arr.get(left)+","+arr.get(right)+")");
            
            }
             if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
