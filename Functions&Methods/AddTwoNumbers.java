import java.util.*;
public class AddTwoNumbers{
    protected static int add(int a,int b){
        int sum = a+b;
        return sum;
    }
  public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first Number");
       int a = sc.nextInt();
       System.out.println("Enter the second Number");
       int b = sc.nextInt();

       System.out.println(  add(a,b));
  }
}