import java.util.*;
public class functionOverloading {
    public static void sum(int x, int y ){
        System.out.println(x+y);
    }
    public static void sum(float x,float y){
        System.out.println(x+y);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number");
    float a = sc.nextInt();
    System.out.println("Enter Second Number");
    float b = sc.nextInt();
    sum(a,b);
    }
}
