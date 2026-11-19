// LeetCode 1672 - Richest Customer Wealth
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximum = 0;

        for (int i = 0; i < accounts.length; i++) {
            int total = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }
            maximum = Math.max(maximum, total);
        }

        return maximum;
    }
}
