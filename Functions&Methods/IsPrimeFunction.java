import java.util.*;
public class IsPrimeFunction {
/* *    public static void IsPrime(int n){
        boolean IsPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                IsPrime = false;
                break;
            }
        }
        if(IsPrime==true)
        {
            System.out.println("This is a prime number");
        }
        else
        {
            System.out.println("This is Not prime number");
        }
    }*/

    //Optimized IsPrime
        public static void IsPrime(int n){
            boolean IsPrime = true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    IsPrime = false;
                    break;
                }
            }
            if(IsPrime==true)
            {
                System.out.println("This is a prime number");
            }
            else
            {
                System.out.println("This is Not prime number");
            }
        }
    
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int n = sc.nextInt();
         IsPrime(n);
    }
}
