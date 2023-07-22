import java.util.ArrayList;
public class SwappingTwoNumbersInAnArrayList {

public static void main(String args[]){
    ArrayList <Integer> arr = new ArrayList<>();
    arr.add(2);
    arr.add(5);
    arr.add(9);
    arr.add(3);
    arr.add(6);
    
    int temp = 0;
    int idx1 = 1;
    int idx2 = 3;
    for(int i=0;i<arr.size();i++){
        
          temp = arr.get(idx1);
          arr.set(idx1,arr.get(idx2));
          arr.set(idx2,temp);
        }

    for(int i=0;i<arr.size();i++){
          System.out.println(arr.get(i));
    }
}
}
