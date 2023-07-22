import java.util.*;
public class QuickSort {
    /*public static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1; 

        for(int j=low;j<=high;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    
        int temp = arr[i+1];
      arr[i+1] = arr[high];       
      arr[high] = temp;
      return i;
    }

    public static void quickSort(int arr[],int low ,int high){
           
        if(low<high){
            
            int part = partition(arr, low, high);
            quickSort(arr, low, part-1);
            quickSort(arr, part+1, high);
        }
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the range of an array");
       int n =  sc.nextInt();
       int arr[] = new int[n];
       System.out.println("Enter the elements of an array");
       for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();

       }

        quickSort(arr, 0, arr.length-1);
   System.out.println("---------");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }*/
    public static int partition(int arr[],int low,int high)
    {
    int pivot,i,j;
    pivot=arr[high];
    i=low-1;
    for(j=low;j<=high;j++)
    {
    if(arr[j]<pivot)
    {
    i++;
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    }
    }
    int temp=arr[i+1];
    arr[i+1]=arr[high];
    arr[high]=temp;
    return (i+1);
    }
    public static void quicksort(int arr[],int low,int high)
    {
    if(low<high)
    {
    int pi;
    pi=partition(arr,low,high);
    quicksort(arr,low,pi-1);
    quicksort(arr,pi+1,high);
    }
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("\t enter the size of an array \n");
    int n=sc.nextInt();
    int i;
    int arr[]=new int[100];
    System.out.println("\t enter the elements of an array \n");
    for(i=0;i<n;i++)
    {
    arr[i]=sc.nextInt();
    }
    quicksort(arr,0,n-1);
    for(i=0;i<n;i++)
    {
    System.out.println(arr[i]);
    }
    }
}
