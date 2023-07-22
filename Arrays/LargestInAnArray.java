import java.util.*;
public class LargestInAnArray {
    public static int largestNumber(int arr[],int n){
        int temp = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        return temp;    
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

      int []arr = new int[100];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       System.out.println(largestNumber(arr, n)+"is largest element in an array");
    }
}
