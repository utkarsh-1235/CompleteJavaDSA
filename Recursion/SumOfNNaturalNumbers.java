import java.util.*;
public class SumOfNNaturalNumbers {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the Number");
 int n = sc.nextInt();
 System.out.println(sumOfn(n));
    }

    public static int sumOfn(int n){
          
        if(n==1){
            return 1;
        }

          return n+sumOfn(n-1);
    }
}
