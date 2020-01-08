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
        long start = System.currentTimeMillis();
        int[] data = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7, 4, 7, 3, 9, 3, 6, 7, 4, 3, 23, 11, 3, 8, 9, 10, 11, 2, 45, 33,22,33,11,22,33,44,56,77,5,4,3,2,4,7,1, 8, 6, 2, 5, 4, 8, 3, 7, 4, 7, 3, 9, 3, 6, 7, 4, 3, 23, 11, 3, 8, 9, 10, 11, 2, 45, 33,22,33,11,22,33,44,56,77,5,4,3,2,4,7,1, 8, 6, 2, 5, 4, 8, 3, 7, 4, 7, 3, 9, 3, 6, 7, 4, 3, 23, 11, 3, 8, 9, 10, 11, 2, 45, 33,22,33,11,22,33,44,56,77,5,4,3,2,4,7,1, 8, 6, 2, 5, 4, 8, 3, 7, 4, 7, 3, 9, 3, 6, 7, 4, 3, 23, 11, 3, 8, 9, 10, 11, 2, 45, 33,22,33,11,22,33,44,56,77,5,4,3,2,4,7};
        maxArea1(data);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
