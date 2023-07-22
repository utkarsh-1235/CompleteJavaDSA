import java.util.*;
public class printSubarrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an array");
        int n = sc.nextInt();
        int [] arr = new int[100];
         int sum = 0;
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for (int i=0;i<n;i++)
        {
            int start = i;
            for(int j=i;j<n;j++){
               int end = j;
               for(int k=start;k<=end;k++){
                sum = sum+arr[k];
                System.out.print(sum+" ");
               }
               System.out.println();
            }
        }
}
}
