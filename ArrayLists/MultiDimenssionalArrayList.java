import java.util.ArrayList;
public class MultiDimenssionalArrayList {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList <Integer> arr =new ArrayList<>();
        
        arr.add(2);
        arr.add(5);
        arr.add(9);
        arr.add(3);
        //arr.add(6);

        mainList.add(arr);

        for(int i=0;i<mainList.size();i++){
            ArrayList <Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
                
            }
            System.out.println();

        }
    }
}
