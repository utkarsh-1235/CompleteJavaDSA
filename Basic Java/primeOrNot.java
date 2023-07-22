import java.util.*;
public class primeOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean IsPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                IsPrime=false;
            }
        }
        if(IsPrime==true){
            System.out.println("Prime Number");

        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}
