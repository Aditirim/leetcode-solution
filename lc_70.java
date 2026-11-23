//70. Climbing Stairs
class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        solve(0,n,dp);
        return dp[0];
    }
    public int solve(int i,int n,int[] dp){
        if(i==n) return 1;
        if(i>n) return 0;
        if(dp[i]!=-1)
        return dp[i];
        dp[i]=solve(i+1,n,dp)+solve(i+2,n,dp);
        return dp[i];
    }
}