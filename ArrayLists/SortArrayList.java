import java.util.*;
public class SortArrayList {
  public static void main(String args[]){
     ArrayList<Integer> arr = new ArrayList<>();
    arr.add(2);
    arr.add(5);
    arr.add(9);
    arr.add(3);
    arr.add(6);

    Collections.sort(arr);
    for(int i=0;i<arr.size();i++){
        System.out.println(arr.get(i));
    }
    Collections.sort(arr,Collections.reverseOrder());
    System.out.println("<---------->");
    for(int i=0;i<arr.size();i++){
        System.out.println(arr.get(i));
    }
  }
}
