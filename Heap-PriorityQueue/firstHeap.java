import java.util.ArrayList;
public class firstHeap {
    public static class Heap{
      ArrayList<Integer> arr = new ArrayList<>();
    public  void add(int data){
        //add data to the last index
        arr.add(data);
        
        //child is last index of ArrayList;
        int child = arr.size()-1;
        //calculate parent of the child
        int parent = (child-1)/2;
        while(arr.get(child) < arr.get(parent)){
            int temp = arr.get(child);
            arr.set(child, arr.get(parent));
            arr.set(parent,temp);

            child = parent;
            parent = (child-1)/2;
        }

    }
    public  int remove(){

        if(isEmpty()){
            throw new IllegalStateException("Heap is empty");
        }
        int data = arr.size()-1;

        // step1 --> swap first and last element
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        // step2 --> remove element
        arr.remove(arr.size()-1);

        //step3 --> heapify
        heapify(0);


        return data;
        
    }
    public  void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int minInd = i;
          
       if(left < arr.size() && arr.get(minInd) > arr.get(left)){
         minInd = left;
        }
        if(right < arr.size() && arr.get(minInd) < arr.get(right)){
            minInd = right;
        }

        if(minInd != i){
            int temp = arr.get(i);
            arr.set(i,arr.get(minInd));
            arr.set(arr.get(minInd), temp);
            heapify(minInd);

        }
    }

   public int peek(){
    return arr.get(0);
   }
    public  boolean isEmpty(){
        return arr.size()==0;
    }
    }   
    public static  void main(String args[]){
        Heap hp = new Heap();
        hp.add(2);
        hp.add(3);
        hp.add(4);
        hp.add(5);
        hp.add(10);

        // for(int i=0; i<arr.size(); i++){
        //     System.out.print(arr.get(i)+" ");
            
        // }
        // add(1);
        // add(9);
        // add(2);
        // System.out.println();
        // for(int i=0; i<arr.size(); i++){
        //     System.out.print(arr.get(i)+" ");
        //    remove(); 
        // }
            
        // remove();
        // for(int i=0; i<arr.size(); i++){
        //     System.out.print(arr.get(i)+" ");
            
        // }
        while(!hp.isEmpty()){
            System.out.print(hp.peek());
            hp.remove();
        }
    }
}
