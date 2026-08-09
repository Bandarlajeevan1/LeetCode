class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE,maxPrice=0;
        for(int p:prices){
            if(minPrice>p){
                minPrice=p;
            }else{
                int profit=p-minPrice;
                maxPrice=Math.max(maxPrice,profit);
            }
        }
        return maxPrice;
    }
}