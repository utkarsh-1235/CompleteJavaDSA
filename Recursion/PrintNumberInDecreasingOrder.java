import java.util.*;
class PrintNumberInDecreasingOrder{
    public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   System.out.println("Enter the value");
   int n = sc.nextInt();

   System.out.println(printrecursive(n));
    }
    public static int printrecursive(int n){
         if(n==1){
            return 1;
         }
         System.out.println(n);
         return printrecursive(n-1);
    }
}