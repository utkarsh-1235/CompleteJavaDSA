import java.util.*;
public class BinarySearch {
    public static void binarySearch(int arr[],int n,int search){
        int start = 0;
        int end = n-1;
        int middle ;
        while(start<=end)
{
middle=(start+end)/2;
if(arr[middle]<search)
{
start=middle+1;
}
else if(arr[middle]>search)
{
end=middle-1;    
}
else if(arr[middle]==search)
{
   int  temp=middle+1;
System.out.println(search+"found at position"+temp);
break;
}
}
if(start>end)
{
System.out.println("element is not found");
}
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        System.out.println("Enter the elements to be searched");
        int search = sc.nextInt();

        int []arr = new int[100];
        System.out.println("Enter the elements of an array in an sorted manner");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       binarySearch(arr,n,search);
    }
}
