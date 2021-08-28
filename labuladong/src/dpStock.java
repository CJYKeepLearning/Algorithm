public class dpStock {
    public static int dpStockMax1(int[] prices){
        int res = 0;
        for (int buy = 0;buy<prices.length;buy++){
            for (int sell=buy+1;sell<prices.length;sell++){
                res = Math.max(res,prices[buy]-prices[sell]);
            }
        }
        return res;
    }
    public static int dpStockMax2(int[] prices){
        int res=0;
        int curMin = prices[0];
        for (int sell = 1;sell<prices.length;sell++){
            curMin = Math.min(curMin,prices[sell]);
            res = Math.max(res,prices[sell]-curMin);
        }
        return res;
    }
}
