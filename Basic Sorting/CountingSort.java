import java.util.*;
public class CountingSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }

        int [] count = new int[largest+1];

        for(int i=0;i<count.length;i++){
            count[arr[i]]++;
        }
  
        //Sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        System.out.println("Array after counting Sort is :");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
