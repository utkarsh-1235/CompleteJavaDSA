import java.util.*;
public class MergeSort{
    public static void merge(int arr[],int start,int mid,int end){
        int temp[] = new int[end-start+1];
        int i=start;  //iterator for left part
        int j = mid+1;  //iterator for right part
        int k=0;            // iterator for temp array

        while(i<=mid && j<=end){
             if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
             }

             else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=end){
            temp[k++] = arr[j++];
        }

        for(k=0,i=start;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void mergeSort(int arr[],int start,int end){
            if(start>=end){
                return;
            }
            //kaam 
                int mid = start+(end-start)/2;
                mergeSort(arr, start, mid);  // left
                mergeSort(arr, mid+1, end);  //right
                merge(arr, start, mid, end);   //merge
          
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
          mergeSort(arr, 0, arr.length-1);
        System.out.println("-----------");
        for(int i=0;i<n;i++){
          System.out.println(arr[i]);
        }
    }
}