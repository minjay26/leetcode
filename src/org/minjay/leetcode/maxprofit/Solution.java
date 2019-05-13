package org.minjay.leetcode.maxprofit;

public class Solution {

    public static int maxProfit(int[] prices) {
        int maxPro = 0, tmp = 0;
        for (int i = 1; i < prices.length; ++i) {
            tmp = prices[i] - prices[i - 1];
            if (tmp > 0)
                maxPro += tmp;
        }
        return maxPro;
    }

    public static void main(String[] args) {
        maxProfit(new int[]{7, 1, 5, 6, 3, 6, 4});
    }

}
