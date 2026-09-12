class Main{
 static int maxProfit(int[] prices){
  int min=prices[0],profit=0;
  for(int i=1;i<prices.length;i++){
   min=Math.min(min,prices[i]);
   profit=Math.max(profit,prices[i]-min);
  }
  return profit;
 }
 public static void main(String[] args){
  int[] prices={7,1,5,3,6,4};
  System.out.println(maxProfit(prices));
 }
}