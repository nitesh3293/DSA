public class PaintHouseLeetcodeThree {
   /* Explanation: We can describe the problem as dp[m][n][target], meaning: the minimal cost to paint up to house m, ending with color n (I use the 0-based color indexes), achieving target (note that we will need to initialize the matrix using target+1 instead of just target).

So, if we want to calculate the state dp[m][n][target], we try every possible combinations of colors (n*n) for the current and previous house. And we choose the one that leads to the minimum cost. When doing this, we have to be careful, taking the followings actions for every combination:

    Given the current house is not already painted
        If we are painting with the same color as before, we are maintaining the target, so we have the candidate: cost[m][a_color] + dp[m-1][a_color][target]. But do not do this computation if it is not possible to have the previous house with color a_color, meaning dp[m-1][a_color][target] is -1.
        If we are painting with different color than before, then, by painting, we are increasing the target, so in order to achieve our current target, the previous house needs to have one less target. So our candidate is: cost[m][a_color] + dp[m-1][another_color][target-1]. But again, only do this computation if dp[m-1][another_color][target-1] is different from -1.
    Given the current house is already painted, disregard any combinations that tries to paint this house with a color different from houses[m]. But when you hit combinations in which the current house would be painted with the same color as in houses[m], do the following:
        If it is the same color as in the previous house. The candidate will simply be: dp[m-1][same_color][target]. We disregard the cost of painting the house, since it is already painted. Remember: only if dp[m-1][same_color][target] is different from -1.
        If it is different from the previous color. Then the candidate simply will be: dp[m-1][different_color][target-1], if different from -1

And then you wil choose the candidate that leads to the minimum cost possible. If no candidate is valid, then you will simply have -1 as the answer for your current state. Keep doing this, and the final answer will be dp[last index of houses][x][target] where x is the color, on the last house, that leads to the minimal answer (again, be careful to disregard any -1).

The base case is the cost to paint the first house, which doesn't depend on anything before. In case it already has a color, its cost will be 0 for that color and -1 (impossible) for the other colors.

Complexity: O(m*target*n*n)

class Solution {*/
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        int[][][] dp = new int[m][n][target+1];
        
		//initializing
        for(int i = 0; i < m; i++) for(int j = 0; j < n; j++) for(int k=0; k <= target; k++) dp[i][j][k] = -1;
        
		//base case
        for(int i = 0; i < n; i++) {
            if (houses[0] == 0) dp[0][i][1]=cost[0][i];
            else if (houses[0] == i+1) dp[0][i][1] = 0;
        }
        
        for(int i = 1; i < m; i++) {
            for(int t = 1; t <= target && t <= i+1; t++) {  
                for(int j = 0; j < n; j++) {//j is the color we are currently trying to paint house i
                    //do nothing if house is already painted and we are not computing for that color
                    if (houses[i] != 0 && houses[i] != j+1) continue;
                    //if house is already painted with the corresponding color, it will cost nothing
                    int costToPaint = houses[i]==j+1 ? 0 : cost[i][j];
                    
                    //try every combination of colors for the previous house
                    for(int k = 0; k < n; k++) {
                        if (j == k && dp[i-1][k][t] != -1) {
                            dp[i][j][t] = (dp[i][j][t] == -1) ?
                                (costToPaint + dp[i-1][k][t]) :
                                (Math.min(dp[i][j][t], costToPaint + dp[i-1][k][t]));
                        }
                        else if (j != k && dp[i-1][k][t-1] != -1) {
                            dp[i][j][t] = (dp[i][j][t] == -1) ?
                                (costToPaint + dp[i-1][k][t-1]) :
                                (Math.min(dp[i][j][t], costToPaint + dp[i-1][k][t-1]));
                        }
                    }
                }   
            }
        }
        
        int ans = -1;
        for(int i = 0; i < n; i++) {
            if (dp[m-1][i][target] != -1) ans = ans == -1 ? dp[m-1][i][target] : Math.min(ans,dp[m-1][i][target]);
        }
        return ans;
    }
}

