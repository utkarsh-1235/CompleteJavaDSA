import java.util.*;
public class BuyAndSellsStocks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the trading days for that stock");
        int n = sc.nextInt();
        int [] price = new int[n];
         
        System.out.println("Enter the price of stock particular day");
        for(int i=0;i<n;i++){
            price[i] = sc.nextInt();
        }
      
        int buyStock = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<price.length;i++){
            if(buyStock < price[i]){
                int profit = price[i]-maxProfit;
                  maxProfit = Math.max(maxProfit,profit);
            }
            else{
                buyStock = price[i];
            }
        } 
        System.out.println("Maximum profit that can be made is"+maxProfit);
      }  
}
