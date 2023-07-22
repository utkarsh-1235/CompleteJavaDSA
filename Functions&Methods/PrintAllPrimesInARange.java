import java.util.*;
public class PrintAllPrimesInARange{
    
    public static boolean IsPrime(int n){
        boolean IsPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                IsPrime = false;
                return IsPrime;
            }
        }
       /*  if(IsPrime==true)
        {
            System.out.println("This is a prime number");
        }
        else
        {
            System.out.println("This is Not prime number");
        }*/
        return IsPrime;
    }
    public static void PrintAllPrimes(int n){
        for(int i=2;i<=n;i++)
        {
            if(IsPrime(i)){
                 System.out.print(i+" ");
            }
        }
    }

public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int n = sc.nextInt();
     PrintAllPrimes(n);
}
}