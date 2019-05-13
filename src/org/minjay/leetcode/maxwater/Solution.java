package org.minjay.leetcode.maxwater;

public class Solution {

    public static int maxArea1(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int temp = 0;
                if (height[i] < height[j]) {
                    temp = height[i] * (j - i);
                } else {
                    temp = height[j] * (j - i);
                }
                if (max < temp) {
                    max = temp;
                }
            }
        }
        return max;
    }

    public static int maxArea(int[] height) {
        int ans = -1;
        int l = 0, r = height.length - 1;
        while (l < r) {
            ans = Math.max(ans, (r - l) * Math.min(height[l], height[r]));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] data = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        maxArea(data);
    }
}
