import java.util.*;
public class PrintXToThePowerN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power");
        int n = sc.nextInt();
         
        System.out.println("Enter the base of the power");
        int x = sc.nextInt();
        System.out.println(power(x, n));
        
    }

    /*public static int power(int x,int n){
        if(n==1){
            return x;
        }
        return x*power(x,n-1);
    }*/


    //More Optimized

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int halfPower = power(x/2, n/2) ;
          int halfSquare = halfPower * halfPower;
        if(n%2 != 0){
             halfSquare = x*halfPower;
            
        }
        return halfSquare;
    }
}
