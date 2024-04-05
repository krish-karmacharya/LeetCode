class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int balance : account) {
                wealth += balance;
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}