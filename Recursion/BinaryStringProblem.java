import java.util.*;
public class BinaryStringProblem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        BinString(n,0, "");
    }
    public static void BinString(int n , int lastplace , String str ){
        if(n==0){
            System.out.println(str);
            return;
        }
        //Kaam
        BinString(n-1,0, str+"0");
        if(lastplace == 0){
            BinString(n-1,1, str+"1");
        }
    }
}
