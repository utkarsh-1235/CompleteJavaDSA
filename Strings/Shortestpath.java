import java.util.*;
public class Shortestpath {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path");
        String str = sc.next();

        int xi=0,x=0;
        int yi=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e' || str.charAt(i)=='E'){
                 x++;
            }
            else if(str.charAt(i)=='n' || str.charAt(i)=='N'){
                y++;

            }
            else if(str.charAt(i)=='w' || str.charAt(i)=='W'){
               x--;
            }
            else if(str.charAt(i)=='s' || str.charAt(i)=='S'){
               y--;
            }
            //System.out.println("Total distance travelled is("+x+","+y+")");
            
        }
        float Shortestpath =(float)Math.sqrt((float)Math.pow(x-xi,2)+(float)Math.pow(y-yi,2));
        System.out.println(Shortestpath);

    


    }
}
