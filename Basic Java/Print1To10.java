import java.util.Scanner;
public class Print1To10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Range");
       int n = sc.nextInt();
       int i = 1;
       while(i<n){
        System.out.println(i);
        i++;
       }
    }
    
}
