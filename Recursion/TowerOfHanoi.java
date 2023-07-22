import java.util.*;
public class TowerOfHanoi {
  public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number of disc");
          int n = sc.nextInt();
          char a,b,c;
          towerofhanoi(n, "a", "b", "c");
  }
  public static void towerofhanoi(int n , String a,String b,String c){
         if(n==1){
            System.out.println("Move disc 1 from "+a+" "+"to"+" "+b);
            return ; 
         }
         towerofhanoi(n-1, a,c,b);
         System.out.println("Move"+n+"disc"+"from"+a+" "+"to"+" "+b);
         towerofhanoi(n-1,b,a,c);
  }
}
