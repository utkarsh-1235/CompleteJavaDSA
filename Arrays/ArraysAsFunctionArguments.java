public class ArraysAsFunctionArguments {
  public static void update(int arr[]){
    for(int i=0;i<arr.length;i++){
        arr[i]+=1;
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
  }
    public static void main(String args[]){
    int [] arr = new int[]{97,98,99};
    update(arr);
    
  }
}
