class Solution {
    public int maxArea(int[] height) {
        int hi = height.length - 1;
        int lo = 0;
        int a = 0;

        while(lo != hi) {
            int currentArea = Math.min(height[hi], height[lo])*(hi - lo);
            if (height[lo] < height[hi]) lo++;
            else hi--;
            if (currentArea > a) a = currentArea;
        }

        return a;
    }
}