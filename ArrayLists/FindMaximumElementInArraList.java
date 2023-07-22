import java.util.ArrayList;
public class FindMaximumElementInArraList {
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        arr.add(6);
            int temp = arr.get(0);
        for(int i=0;i<arr.size();i++){
            if(temp<arr.get(i)){
                  temp = arr.get(i);
            }
        }
        System.out.println("Maximum Element in an ArrayList is"+" "+temp);
    }
}
