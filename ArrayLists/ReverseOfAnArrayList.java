import java.util.ArrayList;
public class ReverseOfAnArrayList {
    public static void main(String args[]){
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i=1;i<=5;i++){
                arr.add(i);
            }
             System.out.println("print array in reverse order");
             for(int i=arr.size()-1;i>=0;i--){
                System.out.println(arr.get(i));
             }
    }
}
