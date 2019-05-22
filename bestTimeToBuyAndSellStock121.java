class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int len = prices.length;
        int left = 0;
        int right = 1;
        
        while (left < len && right < len) {
            if (prices[left] < prices[right]) {
                int diff = prices[right] - prices[left];
                max = (diff > max) ? diff : max;
                right++;
            } else {
                left = right;
                right++;
            }
        }
        

        
        
        // Brute Force Solution
        // for (int j = 0; j < prices.length; j++) {
        //     for (int i = j+1; i < prices.length; i++) {
        //         if (prices[j] < prices[i]) {
        //             int diff = prices[i] - prices[j];
        //             max = (diff > max) ? diff : max;
        //         }
        //     }
        // }
        return max;
    }
}
