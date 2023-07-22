import java.util.*;
public class Assignment {
   public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the range of an array");
     int n = sc.nextInt();
     int [] arr = new int[n];
     System.out.println("Enter the elements of an array");
     for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
     }
int count = 0;
     for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }

       // System.out.println(count);
          if(count==0){
        System.out.println("false");
            }
            else{
                System.out.println("true");
            }
   }
}
