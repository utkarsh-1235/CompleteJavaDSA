import java.util.ArrayList;
public class CreationOfArrayLists{

    //Java Collection framework
    public static void main(String args[]){
    ArrayList<Integer> arr = new ArrayList<>();
     
    for(int i=0;i<11;i++)
    {
        arr.add(i);
    }
      arr.remove(5);
      arr.set(9,5);
    System.out.println("Your elements are");
    for(int i=0;i<arr.size();i++){
       System.out.println(arr.get(i));
    }

        System.out.println(arr.size());
        System.out.println(arr.contains(6));
    }
}