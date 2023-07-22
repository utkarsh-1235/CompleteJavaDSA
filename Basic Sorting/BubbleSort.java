import java.util.*;
public class BubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of an array");
        int n = sc.nextInt();
       /*  int []arr = new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
             int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;i++){
                if(arr[j]>=arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
            if(count == 0){
                break;
            }
        }

        System.out.println("Our Sorted array is");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }*/


        int a[]=new int[100];
        int count = 0 , temp ,i,j;
     System.out.println("enter the elements of an array ");
     for(i=0;i<n;i++)
     {
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
    for(j=0;j<n-i-1;j++)
    {
    if(a[j]<=a[j+1])
    {
        temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
        count++;
    }
    }
    if(count==0)
    {
     break;
    }
    }
    System.out.println("bubble sort is");
    for(i=0;i<n;i++)
    {
    System.out.println(a[i]);
    }
    }
}
