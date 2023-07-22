import java.util.*;
public class CheckArrayIfSortedOrnot {
   public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n = sc.nextInt();
    int []arr = new int[n];
    System.out.println("Enter the elemnts of an array");
    for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
    }

    System.out.println(arraySortedOrNot(arr, 0));

   }

   public static boolean arraySortedOrNot(int arr[],int i){
      if(i == arr.length-1){
        return true;
      }
      if(arr[i]>arr[i+1]){
        return false;
      }
      return arraySortedOrNot(arr, i+1);
   }

}
