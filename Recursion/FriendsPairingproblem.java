import java.util.*;
public class FriendsPairingproblem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of friends");
        int n = sc.nextInt();
     System.out.println(friendspairing(n));
    }
    public static int friendspairing(int n){
        if(n==1 || n==2){
            return n;
        }

      return friendspairing(n-1)+(n-1)*friendspairing(n-2);
    }
}
