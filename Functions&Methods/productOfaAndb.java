import java.util.*;
public class productOfaAndb {
    public static int product(int x,int y){
        int product = x*y;
        return product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println(product(a,b));
    }
}
