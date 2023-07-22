import java.util.Scanner;

public class LinearSearch {
    public static void linearSearch(int arr[] ,int n,int search){
        int temp =0;
           for(int i=0;i<n;i++){
              if(arr[i]==search){
                      temp++;
                        
                    }
                

           }
           if(temp==0){
            System.out.println("Not Found");
           }
           else{
            System.out.println(search+"Element is prsent"+temp+"times");
           }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        System.out.println("Enter the elements to be searched");
        int search = sc.nextInt();

        int []arr = new int[100];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       linearSearch(arr,n,search);
    }
}
